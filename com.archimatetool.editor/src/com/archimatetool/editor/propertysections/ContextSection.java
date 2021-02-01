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
import com.archimatetool.editor.ui.components.StyledTextControl;
import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IContext;

public class ContextSection extends AbstractECorePropertySection {
    
    private static final String HELP_ID = "com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IContext;
        }

        @Override
        public Class<?> getAdaptableType() {
            return IContext.class;
        }
    }

    private PropertySectionTextControl context_targetedMarket;
    private Combo fComboType_domainCriticality;
    private Combo fComboType_commercialization;
    
    private static final String[] fComboTypeItems = {
            Messages.ContextSection_3,
            Messages.ContextSection_4
        };
        
    // Map original values to combo box positions
    private static final boolean[] fTypeValues = {
    	IContext.TRUE,
    	IContext.FALSE,
    };
    
    @Override
    protected void createControls(Composite parent) {
    	
    	createLabel(parent, Messages.ContextSection_5, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
    	fComboType_domainCriticality = new Combo(parent, SWT.READ_ONLY);
    	fComboType_domainCriticality.setItems(fComboTypeItems);
    	fComboType_domainCriticality.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    	fComboType_domainCriticality.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.ContextSection_6, relationship,
                                IArchimatePackage.Literals.CONTEXT__DOMAIN_CRTICALITY, fTypeValues[fComboType_domainCriticality.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }

                executeCommand(result.unwrap());
            }
        });
        
        createLabel(parent, Messages.ContextSection_7, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fComboType_commercialization = new Combo(parent, SWT.READ_ONLY);
        fComboType_commercialization.setItems(fComboTypeItems);
        fComboType_commercialization.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fComboType_commercialization.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                CompoundCommand result = new CompoundCommand();

                for(EObject relationship : getEObjects()) {
                    if(isAlive(relationship)) {
                        Command cmd = new EObjectFeatureCommand(Messages.ContextSection_8, relationship,
                                IArchimatePackage.Literals.CONTEXT__COMMERCIALIZATION, fTypeValues[fComboType_commercialization.getSelectionIndex()]);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }

                executeCommand(result.unwrap());
            }
        });
        
        createLabel(parent, Messages.ContextSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.NONE);
        StyledTextControl styledTextControl = createStyledTextControl(parent, SWT.SINGLE);
        styledTextControl.setMessage(Messages.ContextSection_2);
        context_targetedMarket = new PropertySectionTextControl(styledTextControl.getControl(), IArchimatePackage.Literals.CONTEXT__TARGET_MARKET) {
            @Override
            protected void textChanged(String oldText, String newText) {
                CompoundCommand result = new CompoundCommand();
                for(EObject notesContent : getEObjects()) {
                    if(isAlive(notesContent)) {
                        Command cmd = new EObjectFeatureCommand(Messages.ContextSection_1, notesContent,
                        		IArchimatePackage.Literals.CONTEXT__TARGET_MARKET, newText);
                        if(cmd.canExecute()) {
                            result.add(cmd);
                        }
                    }
                }
                executeCommand(result.unwrap());
            }
        };
        
        // Help
        PlatformUI.getWorkbench().getHelpSystem().setHelp(context_targetedMarket.getTextControl(), HELP_ID);
    }

    @Override
    protected void notifyChanged(Notification msg) {
        if(msg.getNotifier() == getFirstSelectedObject()) {
            Object feature = msg.getFeature();
            // Model event
            if(feature == IArchimatePackage.Literals.CONTEXT__TARGET_MARKET ||
            		feature == IArchimatePackage.Literals.CONTEXT__COMMERCIALIZATION ||
            		feature == IArchimatePackage.Literals.CONTEXT__DOMAIN_CRTICALITY) {
                update();
            } 
        }
    }

    @Override
    protected void update() {
        if(fIsExecutingCommand) {
            return; 
        }
        
        boolean isDomainCritical = ((IContext)getFirstSelectedObject()).isDomainCrticality();
        boolean isCommercial = ((IContext)getFirstSelectedObject()).isCommercialization();
        
        context_targetedMarket.refresh(getFirstSelectedObject());
        
        context_targetedMarket.setEditable(!isLocked(getFirstSelectedObject()));
        
        if(isDomainCritical) {
        	fComboType_domainCriticality.select(0);
        } else {
        	fComboType_domainCriticality.select(1);
        }
        
        if(isCommercial) {
        	fComboType_commercialization.select(0);
        } else {
        	fComboType_commercialization.select(1);
        }
    }
    
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
    
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}
