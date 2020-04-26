package com.infogain.generics.dto;

import java.util.Objects;

public class PetrolCar extends AutoMobile {

	private static final long serialVersionUID = 1L;
	private int tankCapacity;

	public PetrolCar(String colour, String regeistration, int engineCapacity, int tankCapacity) {
		super(colour, regeistration, engineCapacity);
		this.tankCapacity = tankCapacity;
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tankCapacity);
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
		if (!(obj instanceof PetrolCar)) {
			return false;
		}
		PetrolCar other = (PetrolCar) obj;
		return tankCapacity == other.tankCapacity;
	}

	@Override
	public String toString() {
		return "PetrolCar [tankCapacity=" + tankCapacity + "]";
	}

}
