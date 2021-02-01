package com.archimatetool.editor.ui.factory.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.ArchimateElementEditPart;
import com.archimatetool.editor.diagram.figures.elements.ContextFigure;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchiImages;
import com.archimatetool.model.IArchimatePackage;

public class ContextUIProvider extends AbstractArchimateElementUIProvider{

	@Override
    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getContext();
    }
    
    @Override
    public EditPart createEditPart() {
        return new ArchimateElementEditPart(ContextFigure.class);
    }

    @Override
    public String getDefaultName() {
        return Messages.ContextUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IArchiImages.ImageFactory.getImage(IArchiImages.ICON_CONTEXT);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchiImages.ImageFactory.getImageDescriptor(IArchiImages.ICON_CONTEXT);
    }
    
    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(224, 255, 224);
    }

}
