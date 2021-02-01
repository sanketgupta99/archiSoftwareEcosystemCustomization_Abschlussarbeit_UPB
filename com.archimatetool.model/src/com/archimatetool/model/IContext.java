/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.IContext#isDomainCrticality <em>Domain Crticality</em>}</li>
 *   <li>{@link com.archimatetool.model.IContext#isCommercialization <em>Commercialization</em>}</li>
 *   <li>{@link com.archimatetool.model.IContext#getTargetMarket <em>Target Market</em>}</li>
 * </ul>
 *
 * @see com.archimatetool.model.IArchimatePackage#getContext()
 * @model
 * @generated
 */
public interface IContext extends IImplementationMigrationElement, IBehaviorElement {
	
	boolean TRUE = true; // Default
    boolean FALSE = false;
    
	/**
	 * Returns the value of the '<em><b>Domain Crticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Crticality</em>' attribute.
	 * @see #setDomainCrticality(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getContext_DomainCrticality()
	 * @model
	 * @generated
	 */
	boolean isDomainCrticality();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IContext#isDomainCrticality <em>Domain Crticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Crticality</em>' attribute.
	 * @see #isDomainCrticality()
	 * @generated
	 */
	void setDomainCrticality(boolean value);

	/**
	 * Returns the value of the '<em><b>Commercialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commercialization</em>' attribute.
	 * @see #setCommercialization(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getContext_Commercialization()
	 * @model
	 * @generated
	 */
	boolean isCommercialization();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IContext#isCommercialization <em>Commercialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commercialization</em>' attribute.
	 * @see #isCommercialization()
	 * @generated
	 */
	void setCommercialization(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Market</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Market</em>' attribute.
	 * @see #setTargetMarket(String)
	 * @see com.archimatetool.model.IArchimatePackage#getContext_TargetMarket()
	 * @model
	 * @generated
	 */
	String getTargetMarket();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IContext#getTargetMarket <em>Target Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Market</em>' attribute.
	 * @see #getTargetMarket()
	 * @generated
	 */
	void setTargetMarket(String value);

} // IContext
