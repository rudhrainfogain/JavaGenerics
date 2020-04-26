package com.infogain.generics.dto;

public class Tesla extends ElectricVehicle{
String manufacturer;

/**
 * 
 */
public Tesla() {
	// TODO Auto-generated constructor stub
}

/**
 * @param colour
 * @param regeistration
 * @param voltage
 */
public Tesla(String colour, String regeistration, int voltage,String manufacturer) {
	super(colour, regeistration, voltage);
	this.manufacturer=manufacturer;
}

/**
 * @return the manufacturer
 */
public String getManufacturer() {
	return manufacturer;
}

/**
 * @param manufacturer the manufacturer to set
 */
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

@Override
public String toString() {
	return "Tesla [manufacturer=" + manufacturer + ", Voltage=" + getVoltage() + ", Colour=" + getColour()
			+ ", Regeistration=" + getRegeistration() + "]";
}


}
