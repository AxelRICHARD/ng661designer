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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.ng661designer.part2.GroupPrimitive;
import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;

/**
 * This is the item provider adapter for a {@link org.polarsys.ng661designer.part2.GroupPrimitive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupPrimitiveItemProvider extends TreeTypesItemProvider {
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
	public GroupPrimitiveItemProvider(AdapterFactory adapterFactory) {
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

			addBlockedPropertyDescriptor(object);
			addDrawingPriorityPropertyDescriptor(object);
			addEnablePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addInheritedBlockedPropertyDescriptor(object);
			addInheritedEnablePropertyDescriptor(object);
			addInheritedVisiblePropertyDescriptor(object);
			addTxPropertyDescriptor(object);
			addTyPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_blocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_blocked_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Blocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drawing Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrawingPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_drawingPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_drawingPriority_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_DrawingPriority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_enable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_enable_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Enable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_id_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Blocked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedBlockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_inheritedBlocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_inheritedBlocked_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_InheritedBlocked(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_inheritedEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_inheritedEnable_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_InheritedEnable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_inheritedVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_inheritedVisible_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_InheritedVisible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_tx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_tx_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Tx(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_ty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_ty_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Ty(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GroupPrimitive_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GroupPrimitive_visible_feature", "_UI_GroupPrimitive_type"),
				 Part2Package.eINSTANCE.getGroupPrimitive_Visible(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GroupPrimitive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroupPrimitive"));
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
		String label = ((GroupPrimitive)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_GroupPrimitive_type") :
			getString("_UI_GroupPrimitive_type") + " " + label;
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

		switch (notification.getFeatureID(GroupPrimitive.class)) {
			case Part2Package.GROUP_PRIMITIVE__BLOCKED:
			case Part2Package.GROUP_PRIMITIVE__DRAWING_PRIORITY:
			case Part2Package.GROUP_PRIMITIVE__ENABLE:
			case Part2Package.GROUP_PRIMITIVE__ID:
			case Part2Package.GROUP_PRIMITIVE__INHERITED_BLOCKED:
			case Part2Package.GROUP_PRIMITIVE__INHERITED_ENABLE:
			case Part2Package.GROUP_PRIMITIVE__INHERITED_VISIBLE:
			case Part2Package.GROUP_PRIMITIVE__TX:
			case Part2Package.GROUP_PRIMITIVE__TY:
			case Part2Package.GROUP_PRIMITIVE__VISIBLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Part2Package.GROUP_PRIMITIVE__CHILD_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createArcComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createChildPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCirclePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClippingContainerPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createClockType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createCrownComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createEllipsePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImagePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createKeyboardInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createLinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPathPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPointerGestureAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolarLineComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolygonPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createPolylinePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createRectPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createReplicatePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createScrollWheelInputPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSimpleTextPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createSwitchNodePrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTouchAreaPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createTransformGroupPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(Part2Package.eINSTANCE.getGroupPrimitive_ChildElements(),
				 Part2Factory.eINSTANCE.createWidgetComposition()));
	}

}
