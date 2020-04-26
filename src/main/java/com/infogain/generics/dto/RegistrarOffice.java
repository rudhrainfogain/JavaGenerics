package com.infogain.generics.dto;
public class RegistrarOffice<T extends Vehicle> {

	T vehicle;

	/**
	 * @return the vehicle
	 */
	public T getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(T vehicle) {
		this.vehicle = vehicle;
	}

	public RegistrarOffice(T vehicle) {
		this.vehicle = vehicle;
	}
	
	public RegistrarOffice() {
	}

	@Override
	public String toString() {
		return "RegistrarOffice [vehicle=" + vehicle + "]";
	}

}
