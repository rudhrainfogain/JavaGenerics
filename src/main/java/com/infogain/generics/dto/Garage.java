package com.infogain.generics.dto;

import java.util.ArrayList;
import java.util.List;

public class Garage<T> {
	T vehicle;
	List<T> vehiclesInGarage = new ArrayList<>();

	public void add(T vehicleToBeParked) {
		vehiclesInGarage.add(vehicleToBeParked);
	}
	
	public List<T> getVehicles(){
		return vehiclesInGarage;
	}
	public T getVehicle(int i) {
		return vehiclesInGarage.get(i);
	}
}
