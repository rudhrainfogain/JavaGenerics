package com.infogain.generics.inheritanceanssubtype;

import com.infogain.generics.dto.AutoMobile;
import com.infogain.generics.dto.DieselCar;
import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Garage;
import com.infogain.generics.dto.Vehicle;

public class InheritanceAndSubtypesExample2 {
public static void main(String[] args) {
	Garage<Vehicle> vehicleGarage= new Garage<>();
	vehicleGarage.add(new Vehicle("Red","DL2SP9221"));
	vehicleGarage.add(new ElectricVehicle("bLUE","DL2SP9222",77));
	vehicleGarage.add(new AutoMobile("gREEN","DL2SP9223",76));
	vehicleGarage.add(new DieselCar("pINK","DL2SP9224",77,78));
	System.out.println(vehicleGarage.getVehicles());	
}
}
