package com.infogain.generics.boundedtypes;

import java.util.ArrayList;
import java.util.List;

import com.infogain.generics.dto.AutoMobile;
import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Vehicle;

public class GenericMethodsWithBoundedTypes {
	public static <T extends Number> void addNum(List<T> numList) {
		numList.add(null);
//		numList.add(new Number() {
//			
//			@Override
//			public long longValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public int intValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public float floatValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public double doubleValue() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
//		numList.add(new Integer(2));
		System.out.println(numList);
		
		if (numList.size() > 3) {
			if (numList.get(1).intValue() > numList.get(2).intValue()) {
				System.out.println("bigger");
			} else {
				System.out.println("Smaller");
			}
		}
		else {
			System.out.println("size too small for comparison");
		}
		
		System.out.println();
	}

	public static <T extends Vehicle> void addVehicleToList(List<T> vehicleList, T vehicle) {

//		vehicleList.add(new Vehicle());
//		vehicleList.add(new AutoMobile());
//		vehicleList.add(new ElectricVehicle());
//		vehicleList.add(new MotorBike());

		vehicleList.add(null);
		System.out.println(vehicle.getClass());
		vehicleList.add(vehicle);
		T obj = (T) new Vehicle("Pink", "Dl3sp9210n");
		vehicleList.add(obj);
		System.out.println(vehicleList);
		System.out.println();
	}

	public static void main(String[] args) {
		List<Number> numList=new ArrayList<>();
		List<Integer> intList= new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		addNum(numList);
		addNum(intList);
		addNum(doubleList);
		
		numList.add(new Number() {
			
			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 22;
			}
			
			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		numList.add(33);
numList.add(new Integer(28));
numList.add(Double.valueOf(52.8));
addNum(numList);

doubleList.add(25.6);
doubleList.add(22.8);
doubleList.add(85.2);
doubleList.add(0214.22);
addNum(doubleList);

intList.add(58);
intList.add(1);
addNum(intList);

		
		
		
		
		
		
		
		
		//-------------------------
		List<Vehicle> vehicleList = new ArrayList<>();
		List<AutoMobile> autoMobileList = new ArrayList<>();
		List<ElectricVehicle> electricVehicleList = new ArrayList<>();
		Vehicle v = new Vehicle("REd", "Dl3sp9211n");
		AutoMobile auto = new AutoMobile("Green", "Dl3sp9221n", 25);
		ElectricVehicle ev = new ElectricVehicle("blue", "Dl3sp9221n", 50);

		addVehicleToList(vehicleList, v);
		addVehicleToList(autoMobileList, auto);
		addVehicleToList(electricVehicleList, ev);

		// something different

		vehicleList.add(ev);
		addVehicleToList(vehicleList, auto);

		// The method add(AutoMobile) in the type List<AutoMobile> is not applicable for
		// the arguments (ElectricVehicle)
		// autoMobileList.add(ev);
		// The method add(int, AutoMobile) in the type List<AutoMobile> is not
		// applicable for the arguments (List<AutoMobile>, ElectricVehicle)
		// autoMobileList.add(autoMobileList,ev);

	}
}
