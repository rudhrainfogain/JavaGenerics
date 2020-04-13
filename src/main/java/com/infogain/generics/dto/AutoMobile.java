package com.infogain.generics.dto;
public class AutoMobile extends Vehicle{

	int engineCapacity;
	public AutoMobile(String colour, String regeistration ,int engineCapacity) {
		super(colour, regeistration);
		this.engineCapacity=engineCapacity;
	}
	/**
	 * @return the engineCapacity
	 */
	public int getEngineCapacity() {
		return engineCapacity;
	}
	/**
	 * @param engineCapacity the engineCapacity to set
	 */
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	@Override
	public String toString() {
		return "AutoMobile [engineCapacity=" + engineCapacity + "]";
	}
	
	
	
}
