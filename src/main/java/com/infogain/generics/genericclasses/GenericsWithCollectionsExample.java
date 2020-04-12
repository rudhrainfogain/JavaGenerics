package com.infogain.generics.genericclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsWithCollectionsExample {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("I am so lonely broken angel");
		// al.add(new Object()); The method add(String) in the type List<String> is not
		// applicable for the arguments (Object)
		// List<Object> alo= new ArrayList<String>(); Type mismatch: cannot convert from
		// ArrayList<String> to List<Object>
		List<Object> alo = new ArrayList<>();
		alo.add("So lost i am faded");
		alo.add(new Object());
		// alo=al; Type mismatch: cannot convert from List<String> to List<Object>
		// al.add(Integer.valueOf(22)); The method add(String) in the type List<String>
		// is not applicable for the arguments (Integer)
		Set<String> stringSet = new HashSet<>();
		stringSet.add("You are the shadow to my light");
		// stringSet.add(new Object()); The method add(String) in the type Set<String>
		// is not applicable for the arguments (Object)
		// Set<Number> intSet= new HashSet<Integer>();PolyMorphism concept parent
		// reference can hold child object is applicable for only Base Type not
		// Parameter type
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(22);

	}
}
