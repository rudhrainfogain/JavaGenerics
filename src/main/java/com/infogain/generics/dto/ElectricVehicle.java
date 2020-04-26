package com.infogain.generics.dto;

import java.io.Serializable;
import java.util.Objects;

public class ElectricVehicle extends Vehicle implements Serializable,Comparable<ElectricVehicle>{
	
	private static final long serialVersionUID = 1L;
	
	private int voltage;
	
	public ElectricVehicle(String colour, String regeistration ,int voltage) {
		super(colour, regeistration);
		this.voltage=voltage;
	}
	public ElectricVehicle() {
	}
	/**
	 * @return the voltage
	 */
	public int getVoltage() {
		return voltage;
	}
	
	/**
	 * @param voltage the voltage to set
	 */
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(voltage);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof ElectricVehicle)) {
			return false;
		}
		ElectricVehicle other = (ElectricVehicle) obj;
		return voltage == other.voltage;
	}
	
	@Override
	public int compareTo(ElectricVehicle o) {
		return this.voltage-o.getVoltage();
	}
	@Override
	public String toString() {
		return "ElectricVehicle [voltage=" + voltage + ", Colour=" + getColour() + ", Regeistration="
				+ getRegeistration() + "]";
	}
	
}