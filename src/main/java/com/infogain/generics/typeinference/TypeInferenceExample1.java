package com.infogain.generics.typeinference;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInferenceExample1 {
	public static <T> T pick(T a1, T a2) {
		return a2;
	}
	public static <T> T pick1(T a1, T a2) {
		return a1;
	}

	public static void main(String[] args) {
		Number n=pick(22l, 22.5);
		System.out.println(n.getClass());
		System.out.println(pick(22l, 22.5).getClass());
		Number n1=pick1(22l, 22.5);
		System.out.println(n1.getClass());
		System.out.println(pick1(22l, 22.5).getClass());
		Serializable s= pick("d", new ArrayList<String>());
		Serializable s1= pick1("d", new ArrayList<String>());
		System.out.println(pick("d", new ArrayList<String>()).getClass());
		System.out.println(pick1("d", new ArrayList<String>()).getClass());
		System.out.println(pick("d", new ArrayList<String>()));
		System.out.println(pick1("d", new ArrayList<String>()));
		//ArrayList<String> s2= pick("d", new ArrayList<String>());
		//String s3= pick1("d", new ArrayList<String>());
	}
}
