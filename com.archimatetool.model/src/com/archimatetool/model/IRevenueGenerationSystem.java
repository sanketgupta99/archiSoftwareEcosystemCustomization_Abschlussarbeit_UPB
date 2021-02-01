/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revenue Generation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.IRevenueGenerationSystem#isEntranceFee <em>Entrance Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.IRevenueGenerationSystem#isServiceFee <em>Service Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.IRevenueGenerationSystem#isPlatformFee <em>Platform Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.IRevenueGenerationSystem#isDonation <em>Donation</em>}</li>
 * </ul>
 *
 * @see com.archimatetool.model.IArchimatePackage#getRevenueGenerationSystem()
 * @model
 * @generated
 */
public interface IRevenueGenerationSystem extends IBusinessProcess {
	
	boolean TRUE = true; // Default
    boolean FALSE = false;
    
	/**
	 * Returns the value of the '<em><b>Entrance Fee</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrance Fee</em>' attribute.
	 * @see #setEntranceFee(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getRevenueGenerationSystem_EntranceFee()
	 * @model default="false" id="true"
	 * @generated
	 */
	boolean isEntranceFee();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IRevenueGenerationSystem#isEntranceFee <em>Entrance Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrance Fee</em>' attribute.
	 * @see #isEntranceFee()
	 * @generated
	 */
	void setEntranceFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Fee</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Fee</em>' attribute.
	 * @see #setServiceFee(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getRevenueGenerationSystem_ServiceFee()
	 * @model default="false" id="true"
	 * @generated
	 */
	boolean isServiceFee();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IRevenueGenerationSystem#isServiceFee <em>Service Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Fee</em>' attribute.
	 * @see #isServiceFee()
	 * @generated
	 */
	void setServiceFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Platform Fee</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Fee</em>' attribute.
	 * @see #setPlatformFee(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getRevenueGenerationSystem_PlatformFee()
	 * @model default="false" id="true"
	 * @generated
	 */
	boolean isPlatformFee();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IRevenueGenerationSystem#isPlatformFee <em>Platform Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Fee</em>' attribute.
	 * @see #isPlatformFee()
	 * @generated
	 */
	void setPlatformFee(boolean value);

	/**
	 * Returns the value of the '<em><b>Donation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation</em>' attribute.
	 * @see #setDonation(boolean)
	 * @see com.archimatetool.model.IArchimatePackage#getRevenueGenerationSystem_Donation()
	 * @model default="false" id="true"
	 * @generated
	 */
	boolean isDonation();

	/**
	 * Sets the value of the '{@link com.archimatetool.model.IRevenueGenerationSystem#isDonation <em>Donation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation</em>' attribute.
	 * @see #isDonation()
	 * @generated
	 */
	void setDonation(boolean value);

} // IRevenueGenerationSystem
