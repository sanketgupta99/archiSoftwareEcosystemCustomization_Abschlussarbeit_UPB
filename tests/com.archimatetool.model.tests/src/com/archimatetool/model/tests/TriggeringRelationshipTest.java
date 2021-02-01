/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.tests;

import com.archimatetool.model.IArchimateFactory;
import com.archimatetool.model.ITriggeringRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Triggering Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggeringRelationshipTest extends ArchimateRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriggeringRelationshipTest.class);
	}

	/**
	 * Constructs a new Triggering Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggeringRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Triggering Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ITriggeringRelationship getFixture() {
		return (ITriggeringRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IArchimateFactory.eINSTANCE.createTriggeringRelationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TriggeringRelationshipTest
