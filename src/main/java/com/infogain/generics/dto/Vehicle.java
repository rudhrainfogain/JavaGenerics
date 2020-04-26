package com.infogain.generics.dto;

import java.util.Objects;

public class Vehicle{
	private String colour;
	private String regeistration;
	public Vehicle(String colour, String regeistration) {
		this.colour = colour;
		this.regeistration = regeistration;
	}
	public Vehicle() {
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
	@Override
	public int hashCode() {
		return Objects.hash(colour, regeistration);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vehicle)) {
			return false;
		}
		Vehicle other = (Vehicle) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(regeistration, other.regeistration);
	}
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", regeistration=" + regeistration + "]";
	}
	
	
	
}





