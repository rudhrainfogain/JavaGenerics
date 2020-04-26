package com.infogain.generics.typeinference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.infogain.generics.dto.Garage;
import com.infogain.generics.dto.Vehicle;

public class DiamondOperatorExample1 {
	public static void main(String[] args) {
		Map<String, List<String>> myMapParameterized = new HashMap<String, List<String>>();

		Map<String, List<String>> myMapTypesInferedUsingDiamond = new HashMap<>();

		Map<String, List<String>> myMapRawTypeAssigned = new HashMap();

		Garage<Vehicle> parameterizedGarage = new Garage<Vehicle>();
		Garage<Vehicle> typeInferredGarageUsingDiamondOperator = new Garage<>();
		Garage<Vehicle> rawTypeGarageAssigned = new Garage();
		Garage rawTypeGarageDeclaredAndAssigned = new Garage();
		Garage rawTypeGarageDeclaredAndParameterizedAssigned = new Garage<Vehicle>();
		Garage rawTypeGarageDeclaredAndTypeInferredAssigned = new Garage<>();
		
		
		System.out.println(myMapParameterized);
		System.out.println(myMapTypesInferedUsingDiamond);
		System.out.println(myMapRawTypeAssigned);
		System.out.println(parameterizedGarage);
		System.out.println(typeInferredGarageUsingDiamondOperator);
		System.out.println(rawTypeGarageAssigned);
		System.out.println(rawTypeGarageDeclaredAndAssigned);
		System.out.println(rawTypeGarageDeclaredAndParameterizedAssigned);
		System.out.println(rawTypeGarageDeclaredAndTypeInferredAssigned);

	}
}
