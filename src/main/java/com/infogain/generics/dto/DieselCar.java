package com.infogain.generics.dto;
public class DieselCar extends AutoMobile{

	int tankCapacity;
	
	public DieselCar(String colour, String regeistration, int engineCapacity,int tankCapacity) {
		super(colour, regeistration, engineCapacity);
		this.tankCapacity=tankCapacity;
	}
	
	/**
	 * @return the tankCapacity
	 */
	public int getTankCapacity() {
		return tankCapacity;
	}
	/**
	 * @param tankCapacity the tankCapacity to set
	 */
	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	@Override
	public String toString() {
		return "DieselCar [tankCapacity=" + tankCapacity + "]";
	}
	
	
	
}