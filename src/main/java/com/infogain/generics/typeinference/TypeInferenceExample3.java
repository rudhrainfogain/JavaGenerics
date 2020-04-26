package com.infogain.generics.typeinference;

import com.infogain.generics.dto.Generic;
import com.infogain.generics.dto.NonGeneric;
import com.infogain.generics.dto.Vehicle;

public class TypeInferenceExample3 {

	public static void main(String[] args) {
		NonGeneric ng= new NonGeneric("Definet");
		System.out.println();
		Generic<Vehicle> genericVehicle=new Generic<Vehicle>("Perpendicular");
		genericVehicle.addAndGetType(new Vehicle("Amber", "DKD0001"));
		
		//below wont work on jdk<1.7 will give compile time error
		//To show demo change compiler specification to 1.6
		Generic<Vehicle> genericVehicleWithDiamond=new Generic<>("Tangent");
		genericVehicleWithDiamond.addAndGetType(new Vehicle("Amber", "DKD0001"));
	}
}



