package com.infogain.generics.dto;

public class MechanicSupplier<T> {

	@SuppressWarnings("unchecked")
    public static final <T> Mechanic<T> unInitializedMechanic(){
		return (Mechanic<T>) new Mechanic<>();
		
	}
}
