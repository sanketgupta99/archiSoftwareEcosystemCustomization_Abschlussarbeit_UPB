/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.impl;

import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IOpenness;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Openness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.impl.Openness#getOpenness <em>Openness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Openness extends Constraint implements IOpenness {
	/**
	 * The default value of the '{@link #getOpenness() <em>Openness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenness()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENNESS_EDEFAULT = "Close";

	/**
	 * The cached value of the '{@link #getOpenness() <em>Openness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenness()
	 * @generated
	 * @ordered
	 */
	protected String openness = OPENNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Openness() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IArchimatePackage.Literals.OPENNESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpenness() {
		return openness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenness(String newOpenness) {
		String oldOpenness = openness;
		openness = newOpenness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.OPENNESS__OPENNESS, oldOpenness, openness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IArchimatePackage.OPENNESS__OPENNESS:
				return getOpenness();
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
			case IArchimatePackage.OPENNESS__OPENNESS:
				setOpenness((String)newValue);
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
			case IArchimatePackage.OPENNESS__OPENNESS:
				setOpenness(OPENNESS_EDEFAULT);
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
			case IArchimatePackage.OPENNESS__OPENNESS:
				return OPENNESS_EDEFAULT == null ? openness != null : !OPENNESS_EDEFAULT.equals(openness);
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
		result.append(" (openness: "); //$NON-NLS-1$
		result.append(openness);
		result.append(')');
		return result.toString();
	}

} //Openness
