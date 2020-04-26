package com.infogain.generics.dto;
public class Generic<T>{
	T obj;
	public <X> Generic(X obj) {
	System.out.println(obj.getClass());
	}
	
	public void addAndGetType(T obj) {
		this.obj=obj;
		System.out.println(this.obj.getClass());
	}
}