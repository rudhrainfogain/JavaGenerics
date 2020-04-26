package com.infogain.generics.dto;

public class AutomaticGarage<T> extends Garage<T> {
	
	int noOfAutomaticDoors;

	/**
	 * @return the noOfAutomaticDoors
	 */
	public int getNoOfAutomaticDoors() {
		return noOfAutomaticDoors;
	}

	/**
	 * @param noOfAutomaticDoors the noOfAutomaticDoors to set
	 */
	public void setNoOfAutomaticDoors(int noOfAutomaticDoors) {
		this.noOfAutomaticDoors = noOfAutomaticDoors;
	}
	

}
