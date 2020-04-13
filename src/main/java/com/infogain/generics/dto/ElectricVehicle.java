package com.infogain.generics.dto;
public class ElectricVehicle extends Vehicle{
	int voltage;
	public ElectricVehicle(String colour, String regeistration ,int voltage) {
		super(colour, regeistration);
		this.voltage=voltage;
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
	
}