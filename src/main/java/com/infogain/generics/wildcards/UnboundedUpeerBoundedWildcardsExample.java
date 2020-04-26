package com.infogain.generics.wildcards;

import java.util.List;

public class UnboundedUpeerBoundedWildcardsExample {
	static void m1(List<Object> l1) {
		l1.add(new Object());
		l1.add(new Integer(22));

		System.out.println(l1);
	}

	static <T> void m2(List<T> l1) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		l1.add(null);
		System.out.println(l1);
	}

	static <T> void m3(List<T> l1, T obj) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		l1.add(null);
		l1.add(obj);
		System.out.println(l1);
	}

	static <T extends Number> void m4(List<T> l1) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		/*
		 * l1.add(new Number() {
		 * 
		 * @Override public long longValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public int intValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public float floatValue() { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * @Override public double doubleValue() { // TODO Auto-generated method stub
		 * return 0; } });
		 */
		l1.add(null);
		System.out.println(l1);
	}

	static <T extends Number> void m5(List<T> l1, T obj) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		/*
		 * l1.add(new Number() {
		 * 
		 * @Override public long longValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public int intValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public float floatValue() { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * @Override public double doubleValue() { // TODO Auto-generated method stub
		 * return 0; } });
		 */
		l1.add(null);
		l1.add(obj);
		System.out.println(l1);
	}

	static void m6(List<?> l1) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		/*
		 * l1.add(new Number() {
		 * 
		 * @Override public long longValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public int intValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public float floatValue() { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * @Override public double doubleValue() { // TODO Auto-generated method stub
		 * return 0; } });
		 */
		l1.add(null);
		System.out.println(l1);
	}

	static void m7(List<? extends Number> l1) {
		// l1.add(new Object());
		// l1.add(new Integer(22));
		/*
		 * l1.add(new Number() {
		 * 
		 * @Override public long longValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public int intValue() { // TODO Auto-generated method stub return
		 * 0; }
		 * 
		 * @Override public float floatValue() { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * @Override public double doubleValue() { // TODO Auto-generated method stub
		 * return 0; } });
		 */
		l1.add(null);
		System.out.println(l1);
	}

}
