package com.archimatetool.editor.ui.factory.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.ArchimateElementEditPart;
import com.archimatetool.editor.diagram.figures.elements.RatingFigure;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchiImages;
import com.archimatetool.model.IArchimatePackage;

public class RatingUIProvider extends AbstractArchimateElementUIProvider{

	@Override
    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getRating();
    }
    
    @Override
    public EditPart createEditPart() {
        return new ArchimateElementEditPart(RatingFigure.class);
    }

    @Override
    public String getDefaultName() {
        return Messages.RatingUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IArchiImages.ImageFactory.getImage(IArchiImages.ICON_RATING);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchiImages.ImageFactory.getImageDescriptor(IArchiImages.ICON_RATING);
    }
    
    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(181, 255, 255);
    }

}
