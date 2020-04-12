package com.infogain.generics.raw;

public class RawTypesExample {

	public static void main(String[] args) {
		Test22<Integer> intTest = new Test22<>();// Not a raw type
		intTest.printT(22);
		Test22 rawTest = new Test22();// a raw type : Test22 is a raw type. References to generic type Test22<T>
										// should be parameterized
		Test22<String> stringTest = new Test22<>();
		rawTest = stringTest; // For backward compatibility, assigning a parameterized type to its raw type is
								// allowed
		intTest = rawTest;// Type safety: The expression of type Test22 needs unchecked conversion to
							// conform to Test22<Integer>
		rawTest.printT("hi");// Type safety: The method printT(Object) belongs to the raw type Test22.
								// References to generic type Test22<T> should be parameterized

	}
}

class Test22<T> {
	public void printT(T t) {
		System.out.println(t.toString());
	}
}