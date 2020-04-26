package com.infogain.generics.dto;

import java.io.Serializable;

public class RegionalTransportOffice<T extends Vehicle & Serializable>{
	
	T vehicle;

	public RegionalTransportOffice() {
	}
	
	
	/**
	 * @param vehicle
	 */
	public RegionalTransportOffice(T vehicle) {
		this.vehicle = vehicle;
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
		return "RegionalTransportOffice [vehicle=" + vehicle + "]";
	}

	
}
