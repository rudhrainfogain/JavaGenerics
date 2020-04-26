
package com.infogain.generics.boundedtypes;

import com.infogain.generics.dto.AutoMobile;
import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.MotorBike;
import com.infogain.generics.dto.RegionalTransportOffice;
import com.infogain.generics.dto.RegistrarOffice;
import com.infogain.generics.dto.Vehicle;
import com.infogain.generics.dto.VehicleRegistrationOffice;

public class BoundedTypeParametersExample2 {

	public static void main(String[] args) {
		// Vehicle class children
		// AutoMobile implements serializable extends vehicle
		// ElectricVehicle extends Vehicle implements
		// Serializable,Comparable<ElectricVehicle>
		// MotorBike extends Vehicle

		// generic classes that use vehicle as a bounded.
		// RegionalTransportOffice<T extends Vehicle & Serializable>
		// VehicleRegistrationOffice<T extends Vehicle & Serializable & Comparable<T>>
		// RegistrarOffice<T extends Vehicle>

		RegistrarOffice<Vehicle> vehicleRegistrationOffice = new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
		RegistrarOffice<Vehicle> vehicleRegistrationOffice1 = new RegistrarOffice<>();
		RegistrarOffice<Vehicle> vehicleRegistrationOffice2 = new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
		RegistrarOffice<Vehicle> vehicleRegistrationOffice3 = new RegistrarOffice<>(new MotorBike());
		RegistrarOffice<Vehicle> vehicleRegistrationOffice4 = new RegistrarOffice<Vehicle>();
		// Not allowed
		// RegistrarOffice<Vehicle> vehicleRegistrationOffice4=new
		// RegistrarOffice<MotorBike>(new MotorBike());
		RegistrarOffice<MotorBike> vehicleRegistrationOffice6 = new RegistrarOffice<>(new MotorBike());
		RegistrarOffice<MotorBike> vehicleRegistrationOffice7 = new RegistrarOffice<>();
		RegistrarOffice<MotorBike> vehicleRegistrationOffice8 = new RegistrarOffice<MotorBike>();
		RegistrarOffice<MotorBike> vehicleRegistrationOffice9 = new RegistrarOffice<MotorBike>(new MotorBike());

		RegistrarOffice<Vehicle> vehicleRegistrationOffice10 = new RegistrarOffice<>(new AutoMobile());
		RegistrarOffice<Vehicle> vehicleRegistrationOffice11 = new RegistrarOffice<>();
		RegistrarOffice<Vehicle> vehicleRegistrationOffice12 = new RegistrarOffice<>(new AutoMobile());
		RegistrarOffice<Vehicle> vehicleRegistrationOffice13 = new RegistrarOffice<>(new AutoMobile());
		RegistrarOffice<Vehicle> vehicleRegistrationOffice14 = new RegistrarOffice<Vehicle>(new AutoMobile());
		// The constructor RegistrarOffice<AutoMobile>(Vehicle) is undefined
		// RegistrarOffice<AutoMobile> vehicleRegistrationOffice15=new
		// RegistrarOffice<AutoMobile>(new Vehicle("Black", "DL2SP990"));

		// ------------------------------------------------------------------------------------------------------------------------------------

		// Bound mismatch: The type Vehicle is not a valid substitute for the bounded
		// parameter <T extends Vehicle & Serializable> of the type
		// RegionalTransportOffice<T>
		// RegionalTransportOffice<Vehicle> rto= new RegionalTransportOffice<>();
		RegionalTransportOffice<AutoMobile> rto1 = new RegionalTransportOffice<>();
		// Cannot infer type arguments for RegionalTransportOffice<>
		// RegionalTransportOffice<AutoMobile> rto2= new RegionalTransportOffice<>(new
		// Vehicle("Black", "DL2SP990"));
		RegionalTransportOffice<AutoMobile> rto3 = new RegionalTransportOffice<>(new AutoMobile());
		RegionalTransportOffice<AutoMobile> rto4 = new RegionalTransportOffice<AutoMobile>();
		RegionalTransportOffice<AutoMobile> rto5 = new RegionalTransportOffice<AutoMobile>(new AutoMobile());

		RegionalTransportOffice<ElectricVehicle> rto6 = new RegionalTransportOffice<>();
		// Cannot infer type arguments for RegionalTransportOffice<>
		// RegionalTransportOffice<ElectricVehicle> rto7= new
		// RegionalTransportOffice<>(new Vehicle("Black", "DL2SP990"));
		RegionalTransportOffice<ElectricVehicle> rto8 = new RegionalTransportOffice<>(new ElectricVehicle());
		RegionalTransportOffice<ElectricVehicle> rto9 = new RegionalTransportOffice<ElectricVehicle>();
		RegionalTransportOffice<ElectricVehicle> rto10 = new RegionalTransportOffice<ElectricVehicle>(
				new ElectricVehicle());

		// ------------------------------------------------------------------------------------------------------------------------------------

		// Bound mismatch: The type Vehicle is not a valid substitute for the bounded
		// parameter <T extends Vehicle & Serializable> of the type
		// VehicleRegistrationOffice<T>
		VehicleRegistrationOffice<ElectricVehicle> rto11 = new VehicleRegistrationOffice<>();
		// Bound mismatch: The type AutoMobile is not a valid substitute for the bounded
		// parameter <T extends Vehicle & Serializable & Comparable<T>> of the type
		// VehicleRegistrationOffice<T>
		// VehicleRegistrationOffice<AutoMobile> rto12= new
		// VehicleRegistrationOffice<>();
		// Cannot infer type arguments for VehicleRegistrationOffice<>
		// VehicleRegistrationOffice<ElectricVehicle> rto13= new
		// VehicleRegistrationOffice<>(new Vehicle("Black", "DL2SP990"));
		VehicleRegistrationOffice<ElectricVehicle> rto14 = new VehicleRegistrationOffice<>(new ElectricVehicle());
		VehicleRegistrationOffice<ElectricVehicle> rto15 = new VehicleRegistrationOffice<ElectricVehicle>();
		VehicleRegistrationOffice<ElectricVehicle> rto16 = new VehicleRegistrationOffice<ElectricVehicle>(
				new ElectricVehicle());

	}

}
