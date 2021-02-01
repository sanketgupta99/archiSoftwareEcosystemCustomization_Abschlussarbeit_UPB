/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.provider;


import com.archimatetool.model.IArchimateFactory;
import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IFolder;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.archimatetool.model.IFolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Nameable_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Nameable_name_feature", "_UI_Nameable_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 IArchimatePackage.Literals.NAMEABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identifier_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Identifier_id_feature", "_UI_Identifier_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 IArchimatePackage.Literals.IDENTIFIER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Documentable_documentation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Documentable_documentation_feature", "_UI_Documentable_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 IArchimatePackage.Literals.DOCUMENTABLE__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Folder_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Folder_type_feature", "_UI_Folder_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 IArchimatePackage.Literals.FOLDER__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IArchimatePackage.Literals.FEATURES__FEATURES);
			childrenFeatures.add(IArchimatePackage.Literals.FOLDER_CONTAINER__FOLDERS);
			childrenFeatures.add(IArchimatePackage.Literals.PROPERTIES__PROPERTIES);
			childrenFeatures.add(IArchimatePackage.Literals.FOLDER__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Folder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Folder")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IFolder)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Folder_type") : //$NON-NLS-1$
			getString("_UI_Folder_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IFolder.class)) {
			case IArchimatePackage.FOLDER__NAME:
			case IArchimatePackage.FOLDER__ID:
			case IArchimatePackage.FOLDER__DOCUMENTATION:
			case IArchimatePackage.FOLDER__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IArchimatePackage.FOLDER__FEATURES:
			case IArchimatePackage.FOLDER__FOLDERS:
			case IArchimatePackage.FOLDER__PROPERTIES:
			case IArchimatePackage.FOLDER__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FEATURES__FEATURES,
				 IArchimateFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER_CONTAINER__FOLDERS,
				 IArchimateFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.PROPERTIES__PROPERTIES,
				 IArchimateFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createFolder()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createArchimateModel()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createJunction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createApplicationService()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessActor()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessObject()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessProcess()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessRole()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createCommunicationNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createCourseOfAction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDistributionNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createEquipment()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createFacility()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createGap()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createImplementationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createMeaning()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createPlateau()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRepresentation()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSystemSoftware()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyEvent()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyProcess()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologyService()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createValueStream()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createAccessRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createAggregationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createAssignmentRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createAssociationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createCompositionRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createFlowRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createInfluenceRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRealizationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createServingRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSpecializationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTriggeringRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelGroup()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelNote()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelImage()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelConnection()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelBendpoint()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createBounds()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createArchimateDiagramModel()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelArchimateObject()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createDiagramModelArchimateConnection()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSketchModel()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSketchModelSticky()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSketchModelActor()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRevenueGenerationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createThirdPartyProvider()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRating()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createReviewing()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createOpenness()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createTechnologicalBoundaryResources()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createSocialBoundaryResources()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 IArchimateFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(IArchimatePackage.Literals.FOLDER__ELEMENTS,
				 XMLTypeFactory.eINSTANCE.createAnyType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == IArchimatePackage.Literals.FEATURES__FEATURES ||
			childFeature == IArchimatePackage.Literals.FOLDER__ELEMENTS ||
			childFeature == IArchimatePackage.Literals.FOLDER_CONTAINER__FOLDERS ||
			childFeature == IArchimatePackage.Literals.PROPERTIES__PROPERTIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArchimateEditPlugin.INSTANCE;
	}

}
