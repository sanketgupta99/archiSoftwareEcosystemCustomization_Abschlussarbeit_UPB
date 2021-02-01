/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.impl;

import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IRevenueGenerationSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revenue Generation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.impl.RevenueGenerationSystem#isEntranceFee <em>Entrance Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.impl.RevenueGenerationSystem#isServiceFee <em>Service Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.impl.RevenueGenerationSystem#isPlatformFee <em>Platform Fee</em>}</li>
 *   <li>{@link com.archimatetool.model.impl.RevenueGenerationSystem#isDonation <em>Donation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevenueGenerationSystem extends BusinessProcess implements IRevenueGenerationSystem {
	/**
	 * The default value of the '{@link #isEntranceFee() <em>Entrance Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntranceFee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTRANCE_FEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntranceFee() <em>Entrance Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntranceFee()
	 * @generated
	 * @ordered
	 */
	protected boolean entranceFee = ENTRANCE_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #isServiceFee() <em>Service Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceFee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_FEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServiceFee() <em>Service Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServiceFee()
	 * @generated
	 * @ordered
	 */
	protected boolean serviceFee = SERVICE_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlatformFee() <em>Platform Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlatformFee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLATFORM_FEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlatformFee() <em>Platform Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlatformFee()
	 * @generated
	 * @ordered
	 */
	protected boolean platformFee = PLATFORM_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDonation() <em>Donation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDonation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDonation() <em>Donation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDonation()
	 * @generated
	 * @ordered
	 */
	protected boolean donation = DONATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevenueGenerationSystem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IArchimatePackage.Literals.REVENUE_GENERATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEntranceFee() {
		return entranceFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntranceFee(boolean newEntranceFee) {
		boolean oldEntranceFee = entranceFee;
		entranceFee = newEntranceFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE, oldEntranceFee, entranceFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isServiceFee() {
		return serviceFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceFee(boolean newServiceFee) {
		boolean oldServiceFee = serviceFee;
		serviceFee = newServiceFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.REVENUE_GENERATION_SYSTEM__SERVICE_FEE, oldServiceFee, serviceFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPlatformFee() {
		return platformFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformFee(boolean newPlatformFee) {
		boolean oldPlatformFee = platformFee;
		platformFee = newPlatformFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE, oldPlatformFee, platformFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDonation() {
		return donation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDonation(boolean newDonation) {
		boolean oldDonation = donation;
		donation = newDonation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.REVENUE_GENERATION_SYSTEM__DONATION, oldDonation, donation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE:
				return isEntranceFee();
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__SERVICE_FEE:
				return isServiceFee();
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE:
				return isPlatformFee();
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__DONATION:
				return isDonation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE:
				setEntranceFee((Boolean)newValue);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__SERVICE_FEE:
				setServiceFee((Boolean)newValue);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE:
				setPlatformFee((Boolean)newValue);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__DONATION:
				setDonation((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE:
				setEntranceFee(ENTRANCE_FEE_EDEFAULT);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__SERVICE_FEE:
				setServiceFee(SERVICE_FEE_EDEFAULT);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE:
				setPlatformFee(PLATFORM_FEE_EDEFAULT);
				return;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__DONATION:
				setDonation(DONATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__ENTRANCE_FEE:
				return entranceFee != ENTRANCE_FEE_EDEFAULT;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__SERVICE_FEE:
				return serviceFee != SERVICE_FEE_EDEFAULT;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__PLATFORM_FEE:
				return platformFee != PLATFORM_FEE_EDEFAULT;
			case IArchimatePackage.REVENUE_GENERATION_SYSTEM__DONATION:
				return donation != DONATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entranceFee: "); //$NON-NLS-1$
		result.append(entranceFee);
		result.append(", serviceFee: "); //$NON-NLS-1$
		result.append(serviceFee);
		result.append(", platformFee: "); //$NON-NLS-1$
		result.append(platformFee);
		result.append(", donation: "); //$NON-NLS-1$
		result.append(donation);
		result.append(')');
		return result.toString();
	}

} //RevenueGenerationSystem
