package com.infogain.generics.dto;

public class HiTechGarage<T> extends AutomaticGarage<T> {
	int noOfCarWashers;
	String securitySystemManufacturer;

	/**
	 * @return the securitySystemManufacturer
	 */
	public String getSecuritySystemManufacturer() {
		return securitySystemManufacturer;
	}

	/**
	 * @param securitySystemManufacturer the securitySystemManufacturer to set
	 */
	public void setSecuritySystemManufacturer(String securitySystemManufacturer) {
		this.securitySystemManufacturer = securitySystemManufacturer;
	}

	/**
	 * @return the noOfCarWashers
	 */
	public int getNoOfCarWashers() {
		return noOfCarWashers;
	}

	/**
	 * @param noOfCarWashers the noOfCarWashers to set
	 */
	public void setNoOfCarWashers(int noOfCarWashers) {
		this.noOfCarWashers = noOfCarWashers;
	}

}
