package com.infogain.generics.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepairShop {

	public static <T> void assignVehicleToMechanicAndRecordTransaction(String name, T vehicle,
			List<Mechanic<T>> mechanics) {
		Mechanic<T> mechanic = new Mechanic<T>(name, vehicle);
		mechanics.add(mechanic);

	}

	public static <T> void showRepairShopStatus(List<Mechanic<T>> mechanics) {

		for (Iterator<Mechanic<T>> iterator = mechanics.iterator(); iterator.hasNext();) {
			Mechanic<T> mechanic = iterator.next();
			T vehicle = mechanic.getVehicleCurrentlyRepairing();
			System.out.println("Mechanic : " + mechanic.getName() + " is currently repairing : " + vehicle);

		}

	}

	
}
