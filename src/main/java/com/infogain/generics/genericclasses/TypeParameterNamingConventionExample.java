package com.infogain.generics.genericclasses;

public class TypeParameterNamingConventionExample {
	public static void main(String[] args) {
		Test<String> test = new Test<>();
		Test1<String, Integer, String> test1 = new Test1<>();
		Test2<String, String, Double, Integer> test2 = new Test2<>();
		Test3<String, Integer, Double, Long, Float> test3 = new Test3<>();
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
	}
}

class Test<T> {// Single Type Parameter
}

class Test1<T, R, S> {// Multiple Type Parameters comma(,) separated
}

class Test2<Rudhra, Chet9a, $Namit, _Neeraj> {// we can use any valid java Identifier as Type Parameters
}

class Test3<T, R, S, U, V> {// By Convention we use Single Capital Letters as Type parameters
}
