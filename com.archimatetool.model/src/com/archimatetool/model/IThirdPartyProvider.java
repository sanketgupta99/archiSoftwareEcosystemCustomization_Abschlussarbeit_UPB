/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third Party Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.IThirdPartyProvider#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see com.archimatetool.model.IArchimatePackage#getThirdPartyProvider()
 * @model
 * @generated
 */
public interface IThirdPartyProvider extends IBusinessActor {
	
	String trusted_partner = "Trusted Partner";
	String independent_developer = "Independent Developer";
	
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"Trusted Partner"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see com.archimatetool.model.IArchimatePackage#getThirdPartyProvider_Category()
	 * @model default="Trusted Partner"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IThirdPartyProvider#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // IThirdPartyProvider
