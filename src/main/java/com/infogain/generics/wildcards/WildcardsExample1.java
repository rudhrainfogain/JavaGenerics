package com.infogain.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

import com.infogain.generics.dto.Vehicle;
import com.infogain.generics.utilities.ListUtils;

public class WildcardsExample1 {

	
	public static void main(String[] args) {
	List<Vehicle> vehicleList= new ArrayList<>();
	vehicleList.add(new Vehicle("Red", "dl2sp9988"));
	vehicleList.add(new Vehicle("Blue", "dl2sp9989"));
	List<Integer> numList=new ArrayList<Integer>();
	numList.add(Integer.valueOf(22));
	numList.add(Integer.valueOf(23));
	numList.add(Integer.valueOf(45));
	ListUtils.getSize(vehicleList);
	ListUtils.getSize(numList);
	
}
}
