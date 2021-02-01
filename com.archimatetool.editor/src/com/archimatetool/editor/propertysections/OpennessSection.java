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
import com.archimatetool.model.IOpenness;

public class OpennessSection extends AbstractECorePropertySection {
    
    private static final String HELP_ID = "com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IOpenness;
        }

        @Override
        public Class<?> getAdaptableType() {
            return IOpenness.class;
        }
    }

    private Combo fComboType_openness;
    
    private static final String[] fComboTypeItems = {
        Messages.OpennessSection_2,
        Messages.OpennessSection_3,
        Messages.OpennessSection_4,
    };
    
    // Map original values to combo box positions
    private static final String[] fTypeValues = {
    	IOpenness.open,
    	IOpenness.close,
    	IOpenness.partially_open,
    };
    
    @Override
    protected void createControls(Composite parent) {
        createLabel(parent, Messages.OpennessSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_openness = new Combo(parent, SWT.READ_ONLY);
        fComboType_openness.setItems(fComboTypeItems);
        fComboType_openness.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_openness.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.OpennessSection_1, relationship,
                                IArchimatePackage.Literals.OPENNESS__OPENNESS, fTypeValues[fComboType_openness.getSelectionIndex()]);
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
            if(feature == IArchimatePackage.Literals.OPENNESS__OPENNESS) {
                update();
            }
        }
    }

    @Override
    protected void update() {
        if(fIsExecutingCommand) {
            return; 
        }
        
        String openness = ((IOpenness)getFirstSelectedObject()).getOpenness();
        
        
        if(openness.equalsIgnoreCase(IOpenness.open)) {
        	fComboType_openness.select(0);
        } else if(openness.equalsIgnoreCase(IOpenness.close)){
        	fComboType_openness.select(1);
        } else if(openness.equalsIgnoreCase(IOpenness.partially_open)) {
        	fComboType_openness.select(2);
        }
    }
    
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
}

