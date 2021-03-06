/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.ng661designer.part2.Part2Factory;
import org.polarsys.ng661designer.part2.Part2Package;
import org.polarsys.ng661designer.part2.PolylinePrimitive;
import org.polarsys.ng661designer.part2.PositionListType;
import org.polarsys.ng661designer.part2.StrokeLinecapType;
import org.polarsys.ng661designer.part2.StrokeLinejoinType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getDrawingPriority <em>Drawing Priority</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getInheritedBlocked <em>Inherited Blocked</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getInheritedEnable <em>Inherited Enable</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getInheritedVisible <em>Inherited Visible</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeDashoffset <em>Stroke Dashoffset</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeMiterlimit <em>Stroke Miterlimit</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getStrokewidth <em>Strokewidth</em>}</li>
 *   <li>{@link org.polarsys.ng661designer.part2.impl.PolylinePrimitiveImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolylinePrimitiveImpl extends TreeTypesImpl implements PolylinePrimitive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected PositionListType points;

	/**
	 * The default value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object blocked = BLOCKED_EDEFAULT;

	/**
	 * This is true if the Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockedESet;

	/**
	 * The default value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Object DRAWING_PRIORITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getZIndexType(), "0");

	/**
	 * The cached value of the '{@link #getDrawingPriority() <em>Drawing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPriority()
	 * @generated
	 * @ordered
	 */
	protected Object drawingPriority = DRAWING_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Drawing Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawingPriorityESet;

	/**
	 * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected Object enable = ENABLE_EDEFAULT;

	/**
	 * This is true if the Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_BLOCKED_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedBlocked() <em>Inherited Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedBlocked()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;

	/**
	 * This is true if the Inherited Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedBlockedESet;

	/**
	 * The default value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_ENABLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedEnable() <em>Inherited Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedEnable()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedEnable = INHERITED_ENABLE_EDEFAULT;

	/**
	 * This is true if the Inherited Enable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedEnableESet;

	/**
	 * The default value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object INHERITED_VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getInheritedVisible() <em>Inherited Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedVisible()
	 * @generated
	 * @ordered
	 */
	protected Object inheritedVisible = INHERITED_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Inherited Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritedVisibleESet;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getColorType(), "white");

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Object stroke = STROKE_EDEFAULT;

	/**
	 * This is true if the Stroke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected String strokeDasharray = STROKE_DASHARRAY_EDEFAULT;

	/**
	 * This is true if the Stroke Dasharray attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDasharrayESet;

	/**
	 * The default value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_DASHOFFSET_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "0");

	/**
	 * The cached value of the '{@link #getStrokeDashoffset() <em>Stroke Dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashoffset()
	 * @generated
	 * @ordered
	 */
	protected Object strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;

	/**
	 * This is true if the Stroke Dashoffset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeDashoffsetESet;

	/**
	 * The default value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected static final StrokeLinecapType STROKE_LINECAP_EDEFAULT = StrokeLinecapType.BUTT;

	/**
	 * The cached value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected StrokeLinecapType strokeLinecap = STROKE_LINECAP_EDEFAULT;

	/**
	 * This is true if the Stroke Linecap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinecapESet;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final StrokeLinejoinType STROKE_LINEJOIN_EDEFAULT = StrokeLinejoinType.MITER;

	/**
	 * The cached value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected StrokeLinejoinType strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Stroke Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinejoinESet;

	/**
	 * The default value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_MITERLIMIT_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getRealType(), "4.0");

	/**
	 * The cached value of the '{@link #getStrokeMiterlimit() <em>Stroke Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeMiterlimit()
	 * @generated
	 * @ordered
	 */
	protected Object strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;

	/**
	 * This is true if the Stroke Miterlimit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeMiterlimitESet;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_OPACITY_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getOpacityType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stroke Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeOpacityESet;

	/**
	 * The default value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKEWIDTH_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getDistanceType(), "1.0");

	/**
	 * The cached value of the '{@link #getStrokewidth() <em>Strokewidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokewidth()
	 * @generated
	 * @ordered
	 */
	protected Object strokewidth = STROKEWIDTH_EDEFAULT;

	/**
	 * This is true if the Strokewidth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokewidthESet;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object VISIBLE_EDEFAULT = Part2Factory.eINSTANCE.createFromString(Part2Package.eINSTANCE.getBooleanType(), "true");

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected Object visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylinePrimitiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Part2Package.eINSTANCE.getPolylinePrimitive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionListType getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(PositionListType newPoints, NotificationChain msgs) {
		PositionListType oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(PositionListType newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Part2Package.POLYLINE_PRIMITIVE__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Part2Package.POLYLINE_PRIMITIVE__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(Object newBlocked) {
		Object oldBlocked = blocked;
		blocked = newBlocked;
		boolean oldBlockedESet = blockedESet;
		blockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__BLOCKED, oldBlocked, blocked, !oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlocked() {
		Object oldBlocked = blocked;
		boolean oldBlockedESet = blockedESet;
		blocked = BLOCKED_EDEFAULT;
		blockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__BLOCKED, oldBlocked, BLOCKED_EDEFAULT, oldBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlocked() {
		return blockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDrawingPriority() {
		return drawingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPriority(Object newDrawingPriority) {
		Object oldDrawingPriority = drawingPriority;
		drawingPriority = newDrawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, drawingPriority, !oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrawingPriority() {
		Object oldDrawingPriority = drawingPriority;
		boolean oldDrawingPriorityESet = drawingPriorityESet;
		drawingPriority = DRAWING_PRIORITY_EDEFAULT;
		drawingPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY, oldDrawingPriority, DRAWING_PRIORITY_EDEFAULT, oldDrawingPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrawingPriority() {
		return drawingPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(Object newEnable) {
		Object oldEnable = enable;
		enable = newEnable;
		boolean oldEnableESet = enableESet;
		enableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__ENABLE, oldEnable, enable, !oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnable() {
		Object oldEnable = enable;
		boolean oldEnableESet = enableESet;
		enable = ENABLE_EDEFAULT;
		enableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__ENABLE, oldEnable, ENABLE_EDEFAULT, oldEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnable() {
		return enableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedBlocked() {
		return inheritedBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedBlocked(Object newInheritedBlocked) {
		Object oldInheritedBlocked = inheritedBlocked;
		inheritedBlocked = newInheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, inheritedBlocked, !oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedBlocked() {
		Object oldInheritedBlocked = inheritedBlocked;
		boolean oldInheritedBlockedESet = inheritedBlockedESet;
		inheritedBlocked = INHERITED_BLOCKED_EDEFAULT;
		inheritedBlockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED, oldInheritedBlocked, INHERITED_BLOCKED_EDEFAULT, oldInheritedBlockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedBlocked() {
		return inheritedBlockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedEnable() {
		return inheritedEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedEnable(Object newInheritedEnable) {
		Object oldInheritedEnable = inheritedEnable;
		inheritedEnable = newInheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, inheritedEnable, !oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedEnable() {
		Object oldInheritedEnable = inheritedEnable;
		boolean oldInheritedEnableESet = inheritedEnableESet;
		inheritedEnable = INHERITED_ENABLE_EDEFAULT;
		inheritedEnableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE, oldInheritedEnable, INHERITED_ENABLE_EDEFAULT, oldInheritedEnableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedEnable() {
		return inheritedEnableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInheritedVisible() {
		return inheritedVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedVisible(Object newInheritedVisible) {
		Object oldInheritedVisible = inheritedVisible;
		inheritedVisible = newInheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, inheritedVisible, !oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInheritedVisible() {
		Object oldInheritedVisible = inheritedVisible;
		boolean oldInheritedVisibleESet = inheritedVisibleESet;
		inheritedVisible = INHERITED_VISIBLE_EDEFAULT;
		inheritedVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE, oldInheritedVisible, INHERITED_VISIBLE_EDEFAULT, oldInheritedVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInheritedVisible() {
		return inheritedVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Object newStroke) {
		Object oldStroke = stroke;
		stroke = newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE, oldStroke, stroke, !oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		Object oldStroke = stroke;
		boolean oldStrokeESet = strokeESet;
		stroke = STROKE_EDEFAULT;
		strokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE, oldStroke, STROKE_EDEFAULT, oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return strokeDasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		String oldStrokeDasharray = strokeDasharray;
		strokeDasharray = newStrokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharrayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, strokeDasharray, !oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDasharray() {
		String oldStrokeDasharray = strokeDasharray;
		boolean oldStrokeDasharrayESet = strokeDasharrayESet;
		strokeDasharray = STROKE_DASHARRAY_EDEFAULT;
		strokeDasharrayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY, oldStrokeDasharray, STROKE_DASHARRAY_EDEFAULT, oldStrokeDasharrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDasharray() {
		return strokeDasharrayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeDashoffset() {
		return strokeDashoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDashoffset(Object newStrokeDashoffset) {
		Object oldStrokeDashoffset = strokeDashoffset;
		strokeDashoffset = newStrokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, strokeDashoffset, !oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDashoffset() {
		Object oldStrokeDashoffset = strokeDashoffset;
		boolean oldStrokeDashoffsetESet = strokeDashoffsetESet;
		strokeDashoffset = STROKE_DASHOFFSET_EDEFAULT;
		strokeDashoffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET, oldStrokeDashoffset, STROKE_DASHOFFSET_EDEFAULT, oldStrokeDashoffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDashoffset() {
		return strokeDashoffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinecapType getStrokeLinecap() {
		return strokeLinecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(StrokeLinecapType newStrokeLinecap) {
		StrokeLinecapType oldStrokeLinecap = strokeLinecap;
		strokeLinecap = newStrokeLinecap == null ? STROKE_LINECAP_EDEFAULT : newStrokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, strokeLinecap, !oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinecap() {
		StrokeLinecapType oldStrokeLinecap = strokeLinecap;
		boolean oldStrokeLinecapESet = strokeLinecapESet;
		strokeLinecap = STROKE_LINECAP_EDEFAULT;
		strokeLinecapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP, oldStrokeLinecap, STROKE_LINECAP_EDEFAULT, oldStrokeLinecapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinecap() {
		return strokeLinecapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType getStrokeLinejoin() {
		return strokeLinejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(StrokeLinejoinType newStrokeLinejoin) {
		StrokeLinejoinType oldStrokeLinejoin = strokeLinejoin;
		strokeLinejoin = newStrokeLinejoin == null ? STROKE_LINEJOIN_EDEFAULT : newStrokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, strokeLinejoin, !oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinejoin() {
		StrokeLinejoinType oldStrokeLinejoin = strokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;
		strokeLinejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN, oldStrokeLinejoin, STROKE_LINEJOIN_EDEFAULT, oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinejoin() {
		return strokeLinejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeMiterlimit() {
		return strokeMiterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeMiterlimit(Object newStrokeMiterlimit) {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		strokeMiterlimit = newStrokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, strokeMiterlimit, !oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeMiterlimit() {
		Object oldStrokeMiterlimit = strokeMiterlimit;
		boolean oldStrokeMiterlimitESet = strokeMiterlimitESet;
		strokeMiterlimit = STROKE_MITERLIMIT_EDEFAULT;
		strokeMiterlimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT, oldStrokeMiterlimit, STROKE_MITERLIMIT_EDEFAULT, oldStrokeMiterlimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeMiterlimit() {
		return strokeMiterlimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(Object newStrokeOpacity) {
		Object oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity, !oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeOpacity() {
		Object oldStrokeOpacity = strokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacity = STROKE_OPACITY_EDEFAULT;
		strokeOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY, oldStrokeOpacity, STROKE_OPACITY_EDEFAULT, oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeOpacity() {
		return strokeOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokewidth() {
		return strokewidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokewidth(Object newStrokewidth) {
		Object oldStrokewidth = strokewidth;
		strokewidth = newStrokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH, oldStrokewidth, strokewidth, !oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokewidth() {
		Object oldStrokewidth = strokewidth;
		boolean oldStrokewidthESet = strokewidthESet;
		strokewidth = STROKEWIDTH_EDEFAULT;
		strokewidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH, oldStrokewidth, STROKEWIDTH_EDEFAULT, oldStrokewidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokewidth() {
		return strokewidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(Object newVisible) {
		Object oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Part2Package.POLYLINE_PRIMITIVE__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		Object oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Part2Package.POLYLINE_PRIMITIVE__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Part2Package.POLYLINE_PRIMITIVE__POINTS:
				return basicSetPoints(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Part2Package.POLYLINE_PRIMITIVE__POINTS:
				return getPoints();
			case Part2Package.POLYLINE_PRIMITIVE__BLOCKED:
				return getBlocked();
			case Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY:
				return getDrawingPriority();
			case Part2Package.POLYLINE_PRIMITIVE__ENABLE:
				return getEnable();
			case Part2Package.POLYLINE_PRIMITIVE__ID:
				return getId();
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED:
				return getInheritedBlocked();
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE:
				return getInheritedEnable();
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE:
				return getInheritedVisible();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE:
				return getStroke();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET:
				return getStrokeDashoffset();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP:
				return getStrokeLinecap();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT:
				return getStrokeMiterlimit();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY:
				return getStrokeOpacity();
			case Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH:
				return getStrokewidth();
			case Part2Package.POLYLINE_PRIMITIVE__VISIBLE:
				return getVisible();
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
			case Part2Package.POLYLINE_PRIMITIVE__POINTS:
				setPoints((PositionListType)newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__BLOCKED:
				setBlocked(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY:
				setDrawingPriority(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__ENABLE:
				setEnable(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__ID:
				setId((String)newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED:
				setInheritedBlocked(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE:
				setInheritedEnable(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE:
				setInheritedVisible(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE:
				setStroke(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET:
				setStrokeDashoffset(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP:
				setStrokeLinecap((StrokeLinecapType)newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN:
				setStrokeLinejoin((StrokeLinejoinType)newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT:
				setStrokeMiterlimit(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY:
				setStrokeOpacity(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH:
				setStrokewidth(newValue);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__VISIBLE:
				setVisible(newValue);
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
			case Part2Package.POLYLINE_PRIMITIVE__POINTS:
				setPoints((PositionListType)null);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__BLOCKED:
				unsetBlocked();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY:
				unsetDrawingPriority();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__ENABLE:
				unsetEnable();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__ID:
				setId(ID_EDEFAULT);
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED:
				unsetInheritedBlocked();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE:
				unsetInheritedEnable();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE:
				unsetInheritedVisible();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE:
				unsetStroke();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY:
				unsetStrokeDasharray();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET:
				unsetStrokeDashoffset();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP:
				unsetStrokeLinecap();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN:
				unsetStrokeLinejoin();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT:
				unsetStrokeMiterlimit();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY:
				unsetStrokeOpacity();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH:
				unsetStrokewidth();
				return;
			case Part2Package.POLYLINE_PRIMITIVE__VISIBLE:
				unsetVisible();
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
			case Part2Package.POLYLINE_PRIMITIVE__POINTS:
				return points != null;
			case Part2Package.POLYLINE_PRIMITIVE__BLOCKED:
				return isSetBlocked();
			case Part2Package.POLYLINE_PRIMITIVE__DRAWING_PRIORITY:
				return isSetDrawingPriority();
			case Part2Package.POLYLINE_PRIMITIVE__ENABLE:
				return isSetEnable();
			case Part2Package.POLYLINE_PRIMITIVE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_BLOCKED:
				return isSetInheritedBlocked();
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_ENABLE:
				return isSetInheritedEnable();
			case Part2Package.POLYLINE_PRIMITIVE__INHERITED_VISIBLE:
				return isSetInheritedVisible();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE:
				return isSetStroke();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHARRAY:
				return isSetStrokeDasharray();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_DASHOFFSET:
				return isSetStrokeDashoffset();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINECAP:
				return isSetStrokeLinecap();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_LINEJOIN:
				return isSetStrokeLinejoin();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_MITERLIMIT:
				return isSetStrokeMiterlimit();
			case Part2Package.POLYLINE_PRIMITIVE__STROKE_OPACITY:
				return isSetStrokeOpacity();
			case Part2Package.POLYLINE_PRIMITIVE__STROKEWIDTH:
				return isSetStrokewidth();
			case Part2Package.POLYLINE_PRIMITIVE__VISIBLE:
				return isSetVisible();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (blocked: ");
		if (blockedESet) result.append(blocked); else result.append("<unset>");
		result.append(", drawingPriority: ");
		if (drawingPriorityESet) result.append(drawingPriority); else result.append("<unset>");
		result.append(", enable: ");
		if (enableESet) result.append(enable); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", inheritedBlocked: ");
		if (inheritedBlockedESet) result.append(inheritedBlocked); else result.append("<unset>");
		result.append(", inheritedEnable: ");
		if (inheritedEnableESet) result.append(inheritedEnable); else result.append("<unset>");
		result.append(", inheritedVisible: ");
		if (inheritedVisibleESet) result.append(inheritedVisible); else result.append("<unset>");
		result.append(", stroke: ");
		if (strokeESet) result.append(stroke); else result.append("<unset>");
		result.append(", strokeDasharray: ");
		if (strokeDasharrayESet) result.append(strokeDasharray); else result.append("<unset>");
		result.append(", strokeDashoffset: ");
		if (strokeDashoffsetESet) result.append(strokeDashoffset); else result.append("<unset>");
		result.append(", strokeLinecap: ");
		if (strokeLinecapESet) result.append(strokeLinecap); else result.append("<unset>");
		result.append(", strokeLinejoin: ");
		if (strokeLinejoinESet) result.append(strokeLinejoin); else result.append("<unset>");
		result.append(", strokeMiterlimit: ");
		if (strokeMiterlimitESet) result.append(strokeMiterlimit); else result.append("<unset>");
		result.append(", strokeOpacity: ");
		if (strokeOpacityESet) result.append(strokeOpacity); else result.append("<unset>");
		result.append(", strokewidth: ");
		if (strokewidthESet) result.append(strokewidth); else result.append("<unset>");
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PolylinePrimitiveImpl
