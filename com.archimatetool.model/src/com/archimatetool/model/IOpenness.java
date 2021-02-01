/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Openness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.IOpenness#getOpenness <em>Openness</em>}</li>
 * </ul>
 *
 * @see com.archimatetool.model.IArchimatePackage#getOpenness()
 * @model
 * @generated
 */
public interface IOpenness extends IConstraint {
	
	String open = "Open";
	String close = "Close";
	String partially_open = "Partially Open";
	
	/**
	 * Returns the value of the '<em><b>Openness</b></em>' attribute.
	 * The default value is <code>"Close"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openness</em>' attribute.
	 * @see #setOpenness(String)
	 * @see com.archimatetool.model.IArchimatePackage#getOpenness_Openness()
	 * @model default="Close"
	 * @generated
	 */
	String getOpenness();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IOpenness#getOpenness <em>Openness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openness</em>' attribute.
	 * @see #getOpenness()
	 * @generated
	 */
	void setOpenness(String value);

} // IOpenness
