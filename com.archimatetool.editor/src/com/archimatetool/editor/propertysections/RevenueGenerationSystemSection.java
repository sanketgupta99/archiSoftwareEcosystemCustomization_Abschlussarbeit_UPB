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
import com.archimatetool.model.IRevenueGenerationSystem;

public class RevenueGenerationSystemSection extends AbstractECorePropertySection {
    
    private static final String HELP_ID = "com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IRevenueGenerationSystem;
        }

        @Override
        public Class<?> getAdaptableType() {
            return IRevenueGenerationSystem.class;
        }
    }

    private Combo fComboType_entranceFee;
    private Combo fComboType_serviceFee;
    private Combo fComboType_platformFee;
    private Combo fComboType_donation;
    
    private static final String[] fComboTypeItems = {
        Messages.RevenueGenerationSystemSection_8,
        Messages.RevenueGenerationSystemSection_9
    };
    
    // Map original values to combo box positions
    private static final boolean[] fTypeValues = {
    	IRevenueGenerationSystem.TRUE,
    	IRevenueGenerationSystem.FALSE,
    };
    
    @Override
    protected void createControls(Composite parent) {
        createLabel(parent, Messages.RevenueGenerationSystemSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_platformFee = new Combo(parent, SWT.READ_ONLY);
        fComboType_platformFee.setItems(fComboTypeItems);
        fComboType_platformFee.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_platformFee.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.RevenueGenerationSystemSection_1, relationship,
                                IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE, fTypeValues[fComboType_platformFee.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }

                executeCommand(result.unwrap());
            }
        });
        
        createLabel(parent, Messages.RevenueGenerationSystemSection_2, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_serviceFee = new Combo(parent, SWT.READ_ONLY);
        fComboType_serviceFee.setItems(fComboTypeItems);
        fComboType_serviceFee.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_serviceFee.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.RevenueGenerationSystemSection_3, relationship,
                                IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__SERVICE_FEE, fTypeValues[fComboType_serviceFee.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }

                executeCommand(result.unwrap());
            }
        });
        
        createLabel(parent, Messages.RevenueGenerationSystemSection_4, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_entranceFee = new Combo(parent, SWT.READ_ONLY);
        fComboType_entranceFee.setItems(fComboTypeItems);
        fComboType_entranceFee.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_entranceFee.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.RevenueGenerationSystemSection_5, relationship,
                                IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE, fTypeValues[fComboType_entranceFee.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }

                executeCommand(result.unwrap());
            }
        });
        
        createLabel(parent, Messages.RevenueGenerationSystemSection_6, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_donation = new Combo(parent, SWT.READ_ONLY);
        fComboType_donation.setItems(fComboTypeItems);
        fComboType_donation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_donation.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.RevenueGenerationSystemSection_7, relationship,
                                IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__DONATION, fTypeValues[fComboType_donation.getSelectionIndex()]);
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
            if(feature == IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE ||
            		feature == IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__SERVICE_FEE ||
            		feature == IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE ||
            		feature == IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM__DONATION) {
                update();
            }
        }
    }

    @Override
    protected void update() {
        if(fIsExecutingCommand) {
            return; 
        }
        
        boolean isPlatformFee = ((IRevenueGenerationSystem)getFirstSelectedObject()).isPlatformFee();
        boolean isServiceFee = ((IRevenueGenerationSystem)getFirstSelectedObject()).isServiceFee();
        boolean isEntranceFee = ((IRevenueGenerationSystem)getFirstSelectedObject()).isEntranceFee();
        boolean isDonation = ((IRevenueGenerationSystem)getFirstSelectedObject()).isDonation();
        
        
        if(isPlatformFee) {
        	fComboType_platformFee.select(0);
        } else {
        	fComboType_platformFee.select(1);
        }
        
        if(isServiceFee) {
        	fComboType_serviceFee.select(0);
        } else {
        	fComboType_serviceFee.select(1);
        }
        
        if(isEntranceFee) {
        	fComboType_entranceFee.select(0);
        } else {
        	fComboType_entranceFee.select(1);
        }
        
        if(isDonation) {
        	fComboType_donation.select(0);
        } else {
        	fComboType_donation.select(1);
        }
    }
    
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
}
