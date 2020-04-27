package com.infogain.generics.wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Movable;
import com.infogain.generics.dto.Tesla;
import com.infogain.generics.dto.Transportable;
import com.infogain.generics.dto.Vehicle;

public class LowerBoundedWildcardsExample1 {
	public static void printVehicleDetails(List<? super ElectricVehicle> vehicleList) {

		vehicleList.add(new ElectricVehicle());
		vehicleList.add(new Tesla());
		vehicleList.add(null);
		// it is sure that at least we get a list<ElectricVehicle> ,List<Vehicle> or a
		// List<Object>
		// so we can safely add ElectricVehicle or its subtypes to it anything else can
		// cause an exception
		// for example if it is a List<ElectricVehicle> we cant add vehicle to it
		// vehicleList.add(new Vehicle());
		for (Iterator<? super ElectricVehicle> iterator = vehicleList.iterator(); iterator.hasNext();) {
			Object v = iterator.next();

			System.out.print(v);
			// System.out.print(" is "+v.getColour() +" in color");
			System.out.println();

		}

	}

	public static void printMovable(List<? super Movable> vehicleList) {

		for (Iterator<? super ElectricVehicle> iterator = vehicleList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());

		}
	}

	public static void main(String[] args) {
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(new Vehicle("Red", "DONDON22"));
		vehicleList.add(new Vehicle("BAIGE", "DONDON23"));
		vehicleList.add(new Vehicle("BLUE", "DONDON24"));
		List<Tesla> teslaList = new ArrayList<>();
		teslaList.add(new Tesla("Red", "DONDON12", 44, "Vikram Betaal Automobiles"));
		teslaList.add(new Tesla("BAIGE", "DONDON13", 45, "Ganesh Gaitonde Automobiles"));
		teslaList.add(new Tesla("BLUE", "DONDON14", 46, "Bunty Automobiles"));
		List<ElectricVehicle> electricVehicleList = new ArrayList<>();
		electricVehicleList.add(new ElectricVehicle("Red", "DL2SP9221", 75));
		electricVehicleList.add(new ElectricVehicle("bLUE", "DL2SP9222", 77));
		electricVehicleList.add(new ElectricVehicle("gREEN", "DL2SP9223", 76));
		electricVehicleList.add(new ElectricVehicle("pINK", "DL2SP9224", 78));
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(new Object());
		printVehicleDetails(objectList);
		printVehicleDetails(vehicleList);
		printVehicleDetails(electricVehicleList);
		// The method printVehicleDetails(List<? super ElectricVehicle>) in the type
		// LowerBoundedWildcardsExample1 is not applicable for the arguments
		// (List<Tesla>)
		// printVehicleDetails(teslaList);
		List<Movable> movingThingsList = new ArrayList<>();
		movingThingsList.add(new Vehicle("Red", "DONDON22"));
		movingThingsList.add(new ElectricVehicle("gREEN", "DL2SP9223", 76));
		List<Transportable> transportableThingsList = new ArrayList<>();
		transportableThingsList.add(new Vehicle("BAIGE", "DONDON23"));
		transportableThingsList.add(new ElectricVehicle("bLUE", "DL2SP9222", 77));
		printMovable(movingThingsList);
		printMovable(transportableThingsList);
		printMovable(objectList);
		// Movable m = new Tesla();
		// ArrayList<WheeledVehicle> wheeledVehicleList= new ArrayList<>();
		// ArrayList<MovableVehiclle> movableVehicleList= new ArrayList<>();
		// printMovable(wheeledVehicleList);
	}
}
