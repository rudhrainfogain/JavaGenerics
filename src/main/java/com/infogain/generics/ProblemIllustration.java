package com.infogain.generics;

public class ProblemIllustration {

	public static void add(int a, int b) {
		System.out.println("Sum is " + a + b);
	}

	public static void add(double a, double b) {
		System.out.println("Sum is " + a + b);
	}

	public static void add(long a, long b) {
		System.out.println("Sum is " + a + b);
	}

	public static void main(String[] args) {
		add(1, 2);
		add(3.1, 4.1);
		add(5l, 6l);
	}
}
