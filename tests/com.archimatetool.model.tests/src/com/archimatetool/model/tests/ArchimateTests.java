/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>model</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchimateTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ArchimateTests("model Tests"); //$NON-NLS-1$
		suite.addTestSuite(FolderTest.class);
		suite.addTestSuite(ArchimateModelTest.class);
		suite.addTestSuite(JunctionTest.class);
		suite.addTestSuite(ApplicationCollaborationTest.class);
		suite.addTestSuite(ApplicationComponentTest.class);
		suite.addTestSuite(ApplicationEventTest.class);
		suite.addTestSuite(ApplicationFunctionTest.class);
		suite.addTestSuite(ApplicationInteractionTest.class);
		suite.addTestSuite(ApplicationInterfaceTest.class);
		suite.addTestSuite(ApplicationProcessTest.class);
		suite.addTestSuite(ApplicationServiceTest.class);
		suite.addTestSuite(ArtifactTest.class);
		suite.addTestSuite(AssessmentTest.class);
		suite.addTestSuite(BusinessActorTest.class);
		suite.addTestSuite(BusinessCollaborationTest.class);
		suite.addTestSuite(BusinessEventTest.class);
		suite.addTestSuite(BusinessFunctionTest.class);
		suite.addTestSuite(BusinessInteractionTest.class);
		suite.addTestSuite(BusinessInterfaceTest.class);
		suite.addTestSuite(BusinessObjectTest.class);
		suite.addTestSuite(BusinessProcessTest.class);
		suite.addTestSuite(BusinessRoleTest.class);
		suite.addTestSuite(BusinessServiceTest.class);
		suite.addTestSuite(CapabilityTest.class);
		suite.addTestSuite(CommunicationNetworkTest.class);
		suite.addTestSuite(ContractTest.class);
		suite.addTestSuite(ConstraintTest.class);
		suite.addTestSuite(CourseOfActionTest.class);
		suite.addTestSuite(DataObjectTest.class);
		suite.addTestSuite(DeliverableTest.class);
		suite.addTestSuite(DeviceTest.class);
		suite.addTestSuite(DistributionNetworkTest.class);
		suite.addTestSuite(DriverTest.class);
		suite.addTestSuite(EquipmentTest.class);
		suite.addTestSuite(FacilityTest.class);
		suite.addTestSuite(GapTest.class);
		suite.addTestSuite(GoalTest.class);
		suite.addTestSuite(GroupingTest.class);
		suite.addTestSuite(ImplementationEventTest.class);
		suite.addTestSuite(LocationTest.class);
		suite.addTestSuite(MaterialTest.class);
		suite.addTestSuite(MeaningTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(OutcomeTest.class);
		suite.addTestSuite(PathTest.class);
		suite.addTestSuite(PlateauTest.class);
		suite.addTestSuite(PrincipleTest.class);
		suite.addTestSuite(ProductTest.class);
		suite.addTestSuite(RepresentationTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(RequirementTest.class);
		suite.addTestSuite(StakeholderTest.class);
		suite.addTestSuite(SystemSoftwareTest.class);
		suite.addTestSuite(TechnologyCollaborationTest.class);
		suite.addTestSuite(TechnologyEventTest.class);
		suite.addTestSuite(TechnologyFunctionTest.class);
		suite.addTestSuite(TechnologyInterfaceTest.class);
		suite.addTestSuite(TechnologyInteractionTest.class);
		suite.addTestSuite(TechnologyProcessTest.class);
		suite.addTestSuite(TechnologyServiceTest.class);
		suite.addTestSuite(ValueTest.class);
		suite.addTestSuite(ValueStreamTest.class);
		suite.addTestSuite(WorkPackageTest.class);
		suite.addTestSuite(AccessRelationshipTest.class);
		suite.addTestSuite(AggregationRelationshipTest.class);
		suite.addTestSuite(AssignmentRelationshipTest.class);
		suite.addTestSuite(AssociationRelationshipTest.class);
		suite.addTestSuite(CompositionRelationshipTest.class);
		suite.addTestSuite(FlowRelationshipTest.class);
		suite.addTestSuite(InfluenceRelationshipTest.class);
		suite.addTestSuite(RealizationRelationshipTest.class);
		suite.addTestSuite(ServingRelationshipTest.class);
		suite.addTestSuite(SpecializationRelationshipTest.class);
		suite.addTestSuite(TriggeringRelationshipTest.class);
		suite.addTestSuite(DiagramModelReferenceTest.class);
		suite.addTestSuite(DiagramModelGroupTest.class);
		suite.addTestSuite(DiagramModelNoteTest.class);
		suite.addTestSuite(DiagramModelImageTest.class);
		suite.addTestSuite(DiagramModelConnectionTest.class);
		suite.addTestSuite(DiagramModelBendpointTest.class);
		suite.addTestSuite(BoundsTest.class);
		suite.addTestSuite(ArchimateDiagramModelTest.class);
		suite.addTestSuite(DiagramModelArchimateObjectTest.class);
		suite.addTestSuite(DiagramModelArchimateConnectionTest.class);
		suite.addTestSuite(SketchModelTest.class);
		suite.addTestSuite(SketchModelStickyTest.class);
		suite.addTestSuite(SketchModelActorTest.class);
		suite.addTestSuite(RevenueGenerationSystemTest.class);
		suite.addTestSuite(ThirdPartyProviderTest.class);
		suite.addTestSuite(StoreTest.class);
		suite.addTestSuite(PlatformTest.class);
		suite.addTestSuite(RatingTest.class);
		suite.addTestSuite(RankingTest.class);
		suite.addTestSuite(ReviewingTest.class);
		suite.addTestSuite(OpennessTest.class);
		suite.addTestSuite(TechnologicalBoundaryResourcesTest.class);
		suite.addTestSuite(SocialBoundaryResourcesTest.class);
		suite.addTestSuite(ContextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateTests(String name) {
		super(name);
	}

} //ArchimateTests
