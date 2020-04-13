package com.infogain.generics.dto;
public class Vehicle{
	String colour;
	String regeistration;
	public Vehicle(String colour, String regeistration) {
		this.colour = colour;
		this.regeistration = regeistration;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the regeistration
	 */
	public String getRegeistration() {
		return regeistration;
	}
	/**
	 * @param regeistration the regeistration to set
	 */
	public void setRegeistration(String regeistration) {
		this.regeistration = regeistration;
	}
	
}





