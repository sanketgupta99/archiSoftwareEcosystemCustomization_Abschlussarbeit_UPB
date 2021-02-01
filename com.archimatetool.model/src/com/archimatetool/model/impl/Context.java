/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.impl;

import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.archimatetool.model.impl.Context#isDomainCrticality <em>Domain Crticality</em>}</li>
 *   <li>{@link com.archimatetool.model.impl.Context#isCommercialization <em>Commercialization</em>}</li>
 *   <li>{@link com.archimatetool.model.impl.Context#getTargetMarket <em>Target Market</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Context extends ArchimateElement implements IContext {
	/**
	 * The default value of the '{@link #isDomainCrticality() <em>Domain Crticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainCrticality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOMAIN_CRTICALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDomainCrticality() <em>Domain Crticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainCrticality()
	 * @generated
	 * @ordered
	 */
	protected boolean domainCrticality = DOMAIN_CRTICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommercialization() <em>Commercialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommercialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMERCIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommercialization() <em>Commercialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommercialization()
	 * @generated
	 * @ordered
	 */
	protected boolean commercialization = COMMERCIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMarket() <em>Target Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMarket()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MARKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMarket() <em>Target Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMarket()
	 * @generated
	 * @ordered
	 */
	protected String targetMarket = TARGET_MARKET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Context() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IArchimatePackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDomainCrticality() {
		return domainCrticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainCrticality(boolean newDomainCrticality) {
		boolean oldDomainCrticality = domainCrticality;
		domainCrticality = newDomainCrticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.CONTEXT__DOMAIN_CRTICALITY, oldDomainCrticality, domainCrticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCommercialization() {
		return commercialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommercialization(boolean newCommercialization) {
		boolean oldCommercialization = commercialization;
		commercialization = newCommercialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.CONTEXT__COMMERCIALIZATION, oldCommercialization, commercialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetMarket() {
		return targetMarket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetMarket(String newTargetMarket) {
		String oldTargetMarket = targetMarket;
		targetMarket = newTargetMarket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.CONTEXT__TARGET_MARKET, oldTargetMarket, targetMarket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IArchimatePackage.CONTEXT__DOMAIN_CRTICALITY:
				return isDomainCrticality();
			case IArchimatePackage.CONTEXT__COMMERCIALIZATION:
				return isCommercialization();
			case IArchimatePackage.CONTEXT__TARGET_MARKET:
				return getTargetMarket();
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
			case IArchimatePackage.CONTEXT__DOMAIN_CRTICALITY:
				setDomainCrticality((Boolean)newValue);
				return;
			case IArchimatePackage.CONTEXT__COMMERCIALIZATION:
				setCommercialization((Boolean)newValue);
				return;
			case IArchimatePackage.CONTEXT__TARGET_MARKET:
				setTargetMarket((String)newValue);
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
			case IArchimatePackage.CONTEXT__DOMAIN_CRTICALITY:
				setDomainCrticality(DOMAIN_CRTICALITY_EDEFAULT);
				return;
			case IArchimatePackage.CONTEXT__COMMERCIALIZATION:
				setCommercialization(COMMERCIALIZATION_EDEFAULT);
				return;
			case IArchimatePackage.CONTEXT__TARGET_MARKET:
				setTargetMarket(TARGET_MARKET_EDEFAULT);
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
			case IArchimatePackage.CONTEXT__DOMAIN_CRTICALITY:
				return domainCrticality != DOMAIN_CRTICALITY_EDEFAULT;
			case IArchimatePackage.CONTEXT__COMMERCIALIZATION:
				return commercialization != COMMERCIALIZATION_EDEFAULT;
			case IArchimatePackage.CONTEXT__TARGET_MARKET:
				return TARGET_MARKET_EDEFAULT == null ? targetMarket != null : !TARGET_MARKET_EDEFAULT.equals(targetMarket);
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
		result.append(" (domainCrticality: "); //$NON-NLS-1$
		result.append(domainCrticality);
		result.append(", commercialization: "); //$NON-NLS-1$
		result.append(commercialization);
		result.append(", targetMarket: "); //$NON-NLS-1$
		result.append(targetMarket);
		result.append(')');
		return result.toString();
	}

} //Context
