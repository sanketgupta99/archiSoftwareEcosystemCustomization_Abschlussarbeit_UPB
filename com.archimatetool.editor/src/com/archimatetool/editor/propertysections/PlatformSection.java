package com.archimatetool.editor.propertysections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.archimatetool.editor.model.commands.EObjectFeatureCommand;
import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IPlatform;

public class PlatformSection extends AbstractECorePropertySection {
    private static final String HELP_ID = 
    		"com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IPlatform;
        }
        @Override
        public Class<?> getAdaptableType() {
            return IPlatform.class;
        }
    }
    private Combo fComboType_type;
    private static final String[] fComboTypeItems = {
        Messages.PlatformSection_2,
        Messages.PlatformSection_3,
        Messages.PlatformSection_4,
    };
    // Map original values to combo box positions
    private static final String[] fTypeValues = {
		IPlatform.operating_system,
		IPlatform.web_based_application,
		IPlatform.standalone_application,
    };
    @Override
    protected void createControls(Composite parent) {
        createLabel(parent, Messages.PlatformSection_0, 
        		ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_type = new Combo(parent, SWT.READ_ONLY);
        fComboType_type.setItems(fComboTypeItems);
        fComboType_type.setLayoutData(
        		new GridData(GridData.FILL_HORIZONTAL));
        fComboType_type.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(
                        		Messages.PlatformSection_1, relationship,
                                IArchimatePackage.Literals.PLATFORM__TYPE, 
                                fTypeValues[fComboType_type.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }
                executeCommand(result.unwrap());
            }
        });
        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }
    @Override
    protected void notifyChanged(Notification msg) {
        if(msg.getNotifier() == getFirstSelectedObject()) {
            Object feature = msg.getFeature();
            if(feature == IArchimatePackage.Literals.PLATFORM__TYPE) {
                update();
            }
        }
    }
    @Override
    protected void update() {
        if(fIsExecutingCommand) {
            return; 
        }
        
        String platform_type = ((IPlatform)getFirstSelectedObject()).getType();
        
        
        if(platform_type.equalsIgnoreCase(IPlatform.operating_system)) {
        	fComboType_type.select(0);
        } else if(platform_type.equalsIgnoreCase(IPlatform.web_based_application)){
        	fComboType_type.select(1);
        } else if(platform_type.equalsIgnoreCase(IPlatform.standalone_application)) {
        	fComboType_type.select(2);
        }
    }
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
}
