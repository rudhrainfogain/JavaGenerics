package com.infogain.generics;

public class GenericSolutionProblemIllustration {

	private static <T> void add(T a, T b) {
		System.out.println("Sum is " + a + b);	}
	public static void main(String[] args) {
		add(1, 2);	add(3.1, 4.1); add(5l, 6l);
	}
}
