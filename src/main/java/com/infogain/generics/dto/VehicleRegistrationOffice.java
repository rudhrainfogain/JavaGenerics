package com.infogain.generics.dto;

import java.io.Serializable;

public class VehicleRegistrationOffice<T extends Vehicle & Serializable & Comparable<T>> {

	T vehicle;

	
	/**
	 * @param vehicle
	 */
	public VehicleRegistrationOffice(T vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleRegistrationOffice() {
	}
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


	@Override
	public String toString() {
		return "VehicleRegistrationOffice [vehicle=" + vehicle + "]";
	}

}
