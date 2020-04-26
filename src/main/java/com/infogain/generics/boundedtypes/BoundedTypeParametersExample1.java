
package com.infogain.generics.boundedtypes;


import com.infogain.generics.dto.AutoMobile;
import com.infogain.generics.dto.DieselCar;
import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.PetrolCar;
import com.infogain.generics.dto.RegistrarOffice;
import com.infogain.generics.dto.Vehicle;

public class BoundedTypeParametersExample1 {
	
public static void main(String[] args) {
	
	RegistrarOffice<Vehicle> vehicleRegistrationOffice=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice1=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice2=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice3=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice4=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice5=new RegistrarOffice<Vehicle>(new Vehicle("Black", "DL2SP990"));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice6=new RegistrarOffice<Vehicle>(new AutoMobile("Black", "DL2SP990",22));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice7=new RegistrarOffice<Vehicle>(new ElectricVehicle("Black", "DL2SP990",45));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice8=new RegistrarOffice<Vehicle>(new PetrolCar("Black", "DL2SP990",45,75));
	RegistrarOffice<Vehicle> vehicleRegistrationOffice9=new RegistrarOffice<Vehicle>(new DieselCar("Black", "DL2SP990",45,35));
	
	RegistrarOffice<Vehicle> vehicleRegistrationOffice61=new RegistrarOffice<Vehicle>(new Vehicle("Black", "DL2SP990"));
	//Polymorphism is not applicable for Type Parameters
//	RegistrarOffice<Vehicle> vehicleRegistrationOffice62=new RegistrarOffice<AutoMobile>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<Vehicle> vehicleRegistrationOffice63=new RegistrarOffice<ElectricVehicle>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<Vehicle> vehicleRegistrationOffice64=new RegistrarOffice<PetrolCar>(new PetrolCar("Black", "DL2SP990",45,75));
//	RegistrarOffice<Vehicle> vehicleRegistrationOffice65=new RegistrarOffice<DieselCar>(new DieselCar("Black", "DL2SP990",45,35));
	
	
	//Cannot infer type arguments for RegistrarOffice<>
//	RegistrarOffice<AutoMobile> vehicleRegistrationOffice11=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<AutoMobile> vehicleRegistrationOffice13=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
	
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice12=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice14=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice15=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
	
//	The constructor RegistrarOffice<AutoMobile>(Vehicle) is undefined
//	RegistrarOffice<AutoMobile> vehicleRegistrationOffice16=new RegistrarOffice<AutoMobile>(new Vehicle("Black", "DL2SP990"));

//	The constructor RegistrarOffice<AutoMobile>(ElectricVehicle) is undefined
	//	RegistrarOffice<AutoMobile> vehicleRegistrationOffice17=new RegistrarOffice<AutoMobile>(new ElectricVehicle("Black", "DL2SP990",45));
	
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice18=new RegistrarOffice<AutoMobile>(new AutoMobile("Black", "DL2SP990",22));
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice19=new RegistrarOffice<AutoMobile>(new PetrolCar("Black", "DL2SP990",45,75));
	RegistrarOffice<AutoMobile> vehicleRegistrationOffice20=new RegistrarOffice<AutoMobile>(new DieselCar("Black", "DL2SP990",45,35));
	
	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice23=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
	
//Cannot infer type arguments for RegistrarOffice<>
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice21=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice22=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice24=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice25=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
	
	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice27=new RegistrarOffice<ElectricVehicle>(new ElectricVehicle("Black", "DL2SP990",45));

//	The constructor RegistrarOffice<ElectricVehicle>(Vehicle) is undefined
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice26=new RegistrarOffice<ElectricVehicle>(new Vehicle("Black", "DL2SP990"));

//	The constructor RegistrarOffice<ElectricVehicle>(AutoMobile) is undefined
	//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice28=new RegistrarOffice<ElectricVehicle>(new AutoMobile("Black", "DL2SP990",22));


//	The constructor RegistrarOffice<ElectricVehicle>(PetrolCar) is undefined
	//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice29=new RegistrarOffice<ElectricVehicle>(new PetrolCar("Black", "DL2SP990",45,75));

//	The constructor RegistrarOffice<ElectricVehicle>(DieselCar) is undefined
//	RegistrarOffice<ElectricVehicle> vehicleRegistrationOffice30=new RegistrarOffice<ElectricVehicle>(new DieselCar("Black", "DL2SP990",45,35));

	
	RegistrarOffice<PetrolCar> vehicleRegistrationOffice34=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
	RegistrarOffice<PetrolCar> vehicleRegistrationOffice39=new RegistrarOffice<PetrolCar>(new PetrolCar("Black", "DL2SP990",45,75));

//	Cannot infer type arguments for RegistrarOffice<>
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice31=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice33=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice32=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice35=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
	
//	The constructor RegistrarOffice<PetrolCar>(Vehicle) is undefined
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice36=new RegistrarOffice<PetrolCar>(new Vehicle("Black", "DL2SP990"));
	
//	The constructor RegistrarOffice<PetrolCar>(ElectricVehicle) is undefined
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice37=new RegistrarOffice<PetrolCar>(new ElectricVehicle("Black", "DL2SP990",45));
	
//	The constructor RegistrarOffice<PetrolCar>(PetrolCar) is undefined
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice38=new RegistrarOffice<PetrolCar>(new AutoMobile("Black", "DL2SP990",22));
	
//	The constructor RegistrarOffice<PetrolCar>(DieselCar) is undefined
//	RegistrarOffice<PetrolCar> vehicleRegistrationOffice40=new RegistrarOffice<PetrolCar>(new DieselCar("Black", "DL2SP990",45,35));
	
	RegistrarOffice<DieselCar> vehicleRegistrationOffice45=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
	RegistrarOffice<DieselCar> vehicleRegistrationOffice50=new RegistrarOffice<DieselCar>(new DieselCar("Black", "DL2SP990",45,35));
	
//	Cannot infer type arguments for RegistrarOffice<>
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice41=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice43=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice42=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice44=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
	
//	The constructor RegistrarOffice<DieselCar>(Vehicle/ElectricVehicle/AutoMobile/PetrolCar) is undefined
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice46=new RegistrarOffice<DieselCar>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice47=new RegistrarOffice<DieselCar>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice48=new RegistrarOffice<DieselCar>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<DieselCar> vehicleRegistrationOffice49=new RegistrarOffice<DieselCar>(new PetrolCar("Black", "DL2SP990",45,75));

//	Bound mismatch: The type Object is not a valid substitute for the bounded parameter <T extends Vehicle> of the type RegistrarOffice<T>
//	RegistrarOffice<Object> vehicleRegistrationOffice51=new RegistrarOffice<>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<Object> vehicleRegistrationOffice53=new RegistrarOffice<>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<Object> vehicleRegistrationOffice52=new RegistrarOffice<>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<Object> vehicleRegistrationOffice54=new RegistrarOffice<>(new PetrolCar("Black", "DL2SP990",45,75));
//	RegistrarOffice<Object> vehicleRegistrationOffice55=new RegistrarOffice<>(new DieselCar("Black", "DL2SP990",45,35));
//	RegistrarOffice<Object> vehicleRegistrationOffice56=new RegistrarOffice<Object>(new Vehicle("Black", "DL2SP990"));
//	RegistrarOffice<Object> vehicleRegistrationOffice57=new RegistrarOffice<Object>(new ElectricVehicle("Black", "DL2SP990",45));
//	RegistrarOffice<Object> vehicleRegistrationOffice58=new RegistrarOffice<Object>(new AutoMobile("Black", "DL2SP990",22));
//	RegistrarOffice<Object> vehicleRegistrationOffice59=new RegistrarOffice<Object>(new PetrolCar("Black", "DL2SP990",45,75));
//	RegistrarOffice<Object> vehicleRegistrationOffice60=new RegistrarOffice<Object>(new DieselCar("Black", "DL2SP990",45,35));
}
	
	  
	 
}

