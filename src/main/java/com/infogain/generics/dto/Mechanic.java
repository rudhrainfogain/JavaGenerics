package com.infogain.generics.dto;

public class Mechanic<T> {

	T vehicleCurrentlyRepairing;
String name;
	/**
	 * @param vehicleCurrentlyRepairing
	 */
	public Mechanic(String name,T vehicleCurrentlyRepairing) {
		this.name=name;
		this.vehicleCurrentlyRepairing = vehicleCurrentlyRepairing;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vehicleCurrentlyRepairing
	 */
	public T getVehicleCurrentlyRepairing() {
		return vehicleCurrentlyRepairing;
	}

	/**
	 * @param vehicleCurrentlyRepairing the vehicleCurrentlyRepairing to set
	 */
	public void setVehicleCurrentlyRepairing(T vehicleCurrentlyRepairing) {
		this.vehicleCurrentlyRepairing = vehicleCurrentlyRepairing;
	}
	
}
