package com.infogain.generics.dto;

import java.io.Serializable;
import java.util.Objects;

public class AutoMobile extends Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;
	private int engineCapacity;
	
	public AutoMobile(String colour, String regeistration ,int engineCapacity) {
		super(colour, regeistration);
		this.engineCapacity=engineCapacity;
	}
	public AutoMobile() {
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(engineCapacity);
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
		if (!(obj instanceof AutoMobile)) {
			return false;
		}
		AutoMobile other = (AutoMobile) obj;
		return engineCapacity == other.engineCapacity;
	}
	
	@Override
	public String toString() {
		return "AutoMobile [engineCapacity=" + engineCapacity + "]";
	}
	
	
	
}
