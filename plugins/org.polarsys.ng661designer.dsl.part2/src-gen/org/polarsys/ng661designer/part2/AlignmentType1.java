/**
 * Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.polarsys.ng661designer.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alignment Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.ng661designer.part2.Part2Package#getAlignmentType1()
 * @model extendedMetaData="name='alignment_._1_._type'"
 * @generated
 */
public enum AlignmentType1 implements Enumerator {
	/**
	 * The '<em><b>Top Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LEFT(0, "topLeft", "topLeft"),

	/**
	 * The '<em><b>Center Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER_LEFT(1, "centerLeft", "centerLeft"),

	/**
	 * The '<em><b>Bottom Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_LEFT(2, "bottomLeft", "bottomLeft"),

	/**
	 * The '<em><b>Top Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_CENTER(3, "topCenter", "topCenter"),

	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(4, "center", "center"),

	/**
	 * The '<em><b>Bottom Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_CENTER(5, "bottomCenter", "bottomCenter"),

	/**
	 * The '<em><b>Top Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_RIGHT(6, "topRight", "topRight"),

	/**
	 * The '<em><b>Center Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER_RIGHT(7, "centerRight", "centerRight"),

	/**
	 * The '<em><b>Bottom Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_RIGHT(8, "bottomRight", "bottomRight"),

	/**
	 * The '<em><b>Left Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_ONLY(9, "leftOnly", "leftOnly"),

	/**
	 * The '<em><b>Right Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_ONLY(10, "rightOnly", "rightOnly"),

	/**
	 * The '<em><b>Center Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER_ONLY(11, "centerOnly", "centerOnly");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015, 2018 Airbus and the NG661designer project contributors.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The '<em><b>Top Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT
	 * @model name="topLeft"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Center Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER_LEFT
	 * @model name="centerLeft"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Bottom Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT
	 * @model name="bottomLeft"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_LEFT_VALUE = 2;

	/**
	 * The '<em><b>Top Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_CENTER
	 * @model name="topCenter"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_CENTER_VALUE = 3;

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model name="center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 4;

	/**
	 * The '<em><b>Bottom Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_CENTER
	 * @model name="bottomCenter"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_CENTER_VALUE = 5;

	/**
	 * The '<em><b>Top Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT
	 * @model name="topRight"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>Center Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER_RIGHT
	 * @model name="centerRight"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_RIGHT_VALUE = 7;

	/**
	 * The '<em><b>Bottom Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT
	 * @model name="bottomRight"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_RIGHT_VALUE = 8;

	/**
	 * The '<em><b>Left Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_ONLY
	 * @model name="leftOnly"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_ONLY_VALUE = 9;

	/**
	 * The '<em><b>Right Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_ONLY
	 * @model name="rightOnly"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_ONLY_VALUE = 10;

	/**
	 * The '<em><b>Center Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER_ONLY
	 * @model name="centerOnly"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_ONLY_VALUE = 11;

	/**
	 * An array of all the '<em><b>Alignment Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AlignmentType1[] VALUES_ARRAY =
		new AlignmentType1[] {
			TOP_LEFT,
			CENTER_LEFT,
			BOTTOM_LEFT,
			TOP_CENTER,
			CENTER,
			BOTTOM_CENTER,
			TOP_RIGHT,
			CENTER_RIGHT,
			BOTTOM_RIGHT,
			LEFT_ONLY,
			RIGHT_ONLY,
			CENTER_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Alignment Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AlignmentType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Alignment Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlignmentType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AlignmentType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alignment Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlignmentType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AlignmentType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alignment Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AlignmentType1 get(int value) {
		switch (value) {
			case TOP_LEFT_VALUE: return TOP_LEFT;
			case CENTER_LEFT_VALUE: return CENTER_LEFT;
			case BOTTOM_LEFT_VALUE: return BOTTOM_LEFT;
			case TOP_CENTER_VALUE: return TOP_CENTER;
			case CENTER_VALUE: return CENTER;
			case BOTTOM_CENTER_VALUE: return BOTTOM_CENTER;
			case TOP_RIGHT_VALUE: return TOP_RIGHT;
			case CENTER_RIGHT_VALUE: return CENTER_RIGHT;
			case BOTTOM_RIGHT_VALUE: return BOTTOM_RIGHT;
			case LEFT_ONLY_VALUE: return LEFT_ONLY;
			case RIGHT_ONLY_VALUE: return RIGHT_ONLY;
			case CENTER_ONLY_VALUE: return CENTER_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AlignmentType1(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AlignmentType1
