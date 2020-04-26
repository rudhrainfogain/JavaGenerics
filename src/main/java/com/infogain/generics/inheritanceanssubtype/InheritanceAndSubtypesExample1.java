package com.infogain.generics.inheritanceanssubtype;

import com.infogain.generics.dto.Box;

public class InheritanceAndSubtypesExample1 {
	public static void boxTest(Box<Number> n) {
		System.out.println(n);
	}

	public static void boxTester(Object n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		Box<Number> numBox = new Box<>();
		numBox.add(new Integer(22));
		numBox.add(Integer.valueOf(25));
		numBox.add(new Double(22.5));
		numBox.add(Double.valueOf(27.5));
		System.out.println(numBox.getBoxes());

		Box<Double> doubleBox = new Box<>();
		Box<Integer> intBox = new Box<>();
		boxTest(numBox);

		// Cant add Child objects to this method as Integer is a child of Number but
		// Box<Double> and Box<Integer> is not a child of Box<Number>
		// The method boxTest(Box<Number>) in the type InheritanceAndSubtypesExample1 is
		// not applicable for the arguments (Box<Double>)
		// boxTest(doubleBox);
		// boxTest(intBox);
		boxTester(numBox);
		boxTester(intBox);
		boxTester(doubleBox);
	}

}
