package com.infogain.generics.dto;

import java.util.Objects;

public class MotorBike extends Vehicle {

	private String breakType;

	public MotorBike(String colour, String regeistration, String breakType) {
		super(colour, regeistration);
		this.breakType = breakType;
	}

	public MotorBike() {
	}

	/**
	 * @return the breakType
	 */
	public String getBreakType() {
		return breakType;
	}

	/**
	 * @param breakType the breakType to set
	 */
	public void setBreakType(String breakType) {
		this.breakType = breakType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(breakType);
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
		if (!(obj instanceof MotorBike)) {
			return false;
		}
		MotorBike other = (MotorBike) obj;
		return Objects.equals(breakType, other.breakType);
	}

	@Override
	public String toString() {
		return "MotorBike [breakType=" + breakType + "]";
	}

}
