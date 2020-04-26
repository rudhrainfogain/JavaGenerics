package com.infogain.generics.typeinference;

import java.util.ArrayList;
import java.util.List;

import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Mechanic;
import com.infogain.generics.dto.RepairShop;
import com.infogain.generics.dto.Tesla;
import com.infogain.generics.dto.Vehicle;

public class TypeInferenceExample2 {

	public static void main(String[] args) {
		List<Mechanic<Vehicle>> mechanics = new ArrayList<>();
		RepairShop.<Vehicle>assignVehicleToMechanicAndRecordTransaction("Faizal Khan", new Vehicle("Red", "DL2SP9876"),
				mechanics);
		RepairShop.assignVehicleToMechanicAndRecordTransaction("Ramadhir Singh",
				new ElectricVehicle("Red", "DL2SP9877", 32), mechanics);
		RepairShop.assignVehicleToMechanicAndRecordTransaction("Sardar Khan",
				new Tesla("Red", "DL2SP9878", 32, "Tesla, inc"), mechanics);
		RepairShop.<Vehicle>showRepairShopStatus(mechanics);

		System.out.println();
		RepairShop.showRepairShopStatus(mechanics);
	}

}
