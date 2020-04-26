package com.infogain.generics.dto;
public class NonGeneric{
	
	public<T> NonGeneric(T obj) {

		System.out.println(obj.getClass());
		
	}
}