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
import com.archimatetool.model.IThirdPartyProvider;

public class ThirdPartyProviderSection extends AbstractECorePropertySection {
    
    private static final String HELP_ID = "com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IThirdPartyProvider;
        }

        @Override
        public Class<?> getAdaptableType() {
            return IThirdPartyProvider.class;
        }
    }

    private Combo fComboType_thirdPartyProvider;
    
    private static final String[] fComboTypeItems = {
        Messages.ThirdPartyProvidersSection_2,
        Messages.ThirdPartyProvidersSection_3,
    };
    
    // Map original values to combo box positions
    private static final String[] fTypeValues = {
    	IThirdPartyProvider.trusted_partner,
    	IThirdPartyProvider.independent_developer,
    };
    
    @Override
    protected void createControls(Composite parent) {
        createLabel(parent, Messages.ThirdPartyProvidersSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_thirdPartyProvider = new Combo(parent, SWT.READ_ONLY);
        fComboType_thirdPartyProvider.setItems(fComboTypeItems);
        fComboType_thirdPartyProvider.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_thirdPartyProvider.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.ThirdPartyProvidersSection_1, relationship,
                                IArchimatePackage.Literals.THIRD_PARTY_PROVIDER__CATEGORY, fTypeValues[fComboType_thirdPartyProvider.getSelectionIndex()]);
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
            if(feature == IArchimatePackage.Literals.THIRD_PARTY_PROVIDER__CATEGORY) {
                update();
            }
        }
    }

    @Override
    protected void update() {
        if(fIsExecutingCommand) {
            return; 
        }
        
        String category = ((IThirdPartyProvider)getFirstSelectedObject()).getCategory();
        
        
        if(category.equalsIgnoreCase(IThirdPartyProvider.trusted_partner)) {
        	fComboType_thirdPartyProvider.select(0);
        } else if(category.equalsIgnoreCase(IThirdPartyProvider.independent_developer)){
        	fComboType_thirdPartyProvider.select(1);
        } 
    }
    
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
}
