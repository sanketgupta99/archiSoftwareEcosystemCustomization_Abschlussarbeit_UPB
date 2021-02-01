/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.IPlatform#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.archimatetool.model.IArchimatePackage#getPlatform()
 * @model
 * @generated
 */
public interface IPlatform extends ISystemSoftware {
	
	String operating_system = "Operating System";
	String web_based_application = "Web-Application";
	String standalone_application = "Stand-alone Application";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Operating System"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.archimatetool.model.IArchimatePackage#getPlatform_Type()
	 * @model default="Operating System"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IPlatform#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);
} // IPlatform
