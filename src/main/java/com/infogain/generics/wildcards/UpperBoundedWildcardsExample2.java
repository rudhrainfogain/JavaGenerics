package com.infogain.generics.wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.infogain.generics.dto.Tesla;
import com.infogain.generics.dto.Vehicle;

public class UpperBoundedWildcardsExample2 {

	public static void printVehicleDetails(List<? extends Vehicle> vehicleList)  {
		for (Iterator<? extends Vehicle> iterator = vehicleList.iterator(); iterator.hasNext();) {
		Vehicle v=	iterator.next();
		
			System.out.print(v);
			System.out.print(" is "+v.getColour() +"  in color");
			System.out.println();
			
		}
		//vehicleList.add(new Vehicle());
		//vehicleList.add(new Tesla());
		vehicleList.add(null);
		//vehicleList.add(new Object());
		
	}
	static void gPrint(List<? extends Number> l) {
	    for (Number n : l) {
	        System.out.println(n);
	    }
	}

	static <T extends Number> void gPrintA(List<T> l) {
	    for (Number n : l) {
	        System.out.println(n);
	    }
	}
	public static void main(String[] args) {
		List<Vehicle> vehicleList= new ArrayList<>();
		vehicleList.add(new Vehicle("Red", "DONDON22"));
		vehicleList.add(new Vehicle("BAIGE", "DONDON23"));
		vehicleList.add(new Vehicle("BLUE", "DONDON24"));
		List<Tesla> teslaList= new ArrayList<>();
		teslaList.add(new Tesla("Red", "DONDON12",44,"Vikram Betaal Automobiles"));
		teslaList.add(new Tesla("BAIGE", "DONDON13",45,"Ganesh Gaitonde Automobiles"));
		teslaList.add(new Tesla("BLUE", "DONDON14",46,"Bunty Automobiles"));
		printVehicleDetails(vehicleList);
		printVehicleDetails(teslaList);
	}
}
