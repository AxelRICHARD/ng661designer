/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.ng661designer.part2.FieldType;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.FieldType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_name_feature", "_UI_FieldType_type"),
				 Part2Package.eINSTANCE.getFieldType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldType_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_value_feature", "_UI_FieldType_type"),
				 Part2Package.eINSTANCE.getFieldType_Value(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FieldType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		if (object instanceof FieldType) {
			EStructuralFeature containingFeature = ((FieldType)object).eContainingFeature();
			if (Part2Package.eINSTANCE.getStructPropertyType_Field().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
			} else if (Part2Package.eINSTANCE.getStructPropertyType_EnumField().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumFieldType"));
			} else if (Part2Package.eINSTANCE.getStructEntryType_Field().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
			} else if (Part2Package.eINSTANCE.getStructEntryType_EnumField().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumFieldType"));
			} else if (Part2Package.eINSTANCE.getStructFieldType_Field().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
			} else if (Part2Package.eINSTANCE.getStructFieldType_EnumField().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumFieldType"));
			} else if (Part2Package.eINSTANCE.getStructEventType_Field().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
			} else if (Part2Package.eINSTANCE.getStructEventType_EnumField().equals(containingFeature)) {
				return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumFieldType"));
			}
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FieldType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FieldType_type") :
			getString("_UI_FieldType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FieldType.class)) {
			case Part2Package.FIELD_TYPE__NAME:
			case Part2Package.FIELD_TYPE__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NG661Part2EditPlugin.INSTANCE;
	}

}
