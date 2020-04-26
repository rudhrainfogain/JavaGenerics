package com.infogain.generics.inheritanceanssubtype;

import java.util.Iterator;
import java.util.List;

import com.infogain.generics.dto.AutoMobile;
import com.infogain.generics.dto.AutomaticGarage;
import com.infogain.generics.dto.DieselCar;
import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Garage;
import com.infogain.generics.dto.HiTechGarage;
import com.infogain.generics.dto.Tesla;
import com.infogain.generics.dto.Vehicle;

public class InheritanceAndSubtypesExample3 {
	public static void printGarageDetails(Garage<ElectricVehicle> garage) {
		List<ElectricVehicle> vehiclesParked = garage.getVehicles();
		System.out.println("Garage has following vehicles");
		for (Iterator iterator = vehiclesParked.iterator(); iterator.hasNext();) {
			Vehicle vehicle = (Vehicle) iterator.next();
			System.out.println(vehicle);
		}
		System.out.println();
	}
public static void main(String[] args) {
	Garage<ElectricVehicle> vehicleGarage= new Garage<>();
	vehicleGarage.add(new ElectricVehicle("Red","DL2SP9221",75));
	vehicleGarage.add(new ElectricVehicle("bLUE","DL2SP9222",77));
	vehicleGarage.add(new ElectricVehicle("gREEN","DL2SP9223",76));
	vehicleGarage.add(new ElectricVehicle("pINK","DL2SP9224",78));
	
	AutomaticGarage<ElectricVehicle> automaticGarage= new AutomaticGarage<>();
	automaticGarage.add(new ElectricVehicle("Red","DL2SP9221",65));
	automaticGarage.add(new ElectricVehicle("bLUE","DL2SP9222",67));
	automaticGarage.add(new ElectricVehicle("gREEN","DL2SP9223",66));
	automaticGarage.add(new ElectricVehicle("pINK","DL2SP9224",68));
	
	HiTechGarage<ElectricVehicle> hiTechGarage= new HiTechGarage<>();
	hiTechGarage.add(new ElectricVehicle("Red","DL2SP9221",85));
	hiTechGarage.add(new ElectricVehicle("bLUE","DL2SP9222",87));
	hiTechGarage.add(new ElectricVehicle("gREEN","DL2SP9223",86));
	hiTechGarage.add(new ElectricVehicle("pINK","DL2SP9224",88));
	
	Garage<Tesla> testlaGarage= new Garage<>();
	testlaGarage.add(new Tesla("Red","DL2SP9221",95,"Tesla, Inc"));
	testlaGarage.add(new Tesla("bLUE","DL2SP9222",97,"Tesla, Inc"));
	testlaGarage.add(new Tesla("gREEN","DL2SP9223",96,"Tesla, Inc"));
	testlaGarage.add(new Tesla("pINK","DL2SP9224",98,"Tesla, Inc"));
	
	Garage<ElectricVehicle> testlaHiTechGarage= new Garage<>();
	testlaHiTechGarage.add(new Tesla("Red","DL2SP9221",95,"Tesla, Inc"));
	testlaHiTechGarage.add(new Tesla("bLUE","DL2SP9222",97,"Tesla, Inc"));
	testlaHiTechGarage.add(new Tesla("gREEN","DL2SP9223",96,"Tesla, Inc"));
	testlaHiTechGarage.add(new Tesla("pINK","DL2SP9224",98,"Tesla, Inc"));
	
	printGarageDetails(vehicleGarage);
	printGarageDetails(automaticGarage);
	printGarageDetails(hiTechGarage);
	//printGarageDetails(testlaGarage);
	printGarageDetails(testlaHiTechGarage);
	
	
}
}
