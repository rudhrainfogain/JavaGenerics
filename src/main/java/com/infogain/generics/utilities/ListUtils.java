package com.infogain.generics.utilities;

import java.util.List;

public class ListUtils {
	public static int getSize(List<?> l) {
		System.out.println("size of list is "+l.size());
		return l.size();
	}
}
