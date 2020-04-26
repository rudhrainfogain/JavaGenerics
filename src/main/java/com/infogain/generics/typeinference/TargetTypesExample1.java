package com.infogain.generics.typeinference;

import com.infogain.generics.dto.ElectricVehicle;
import com.infogain.generics.dto.Mechanic;
import com.infogain.generics.dto.MechanicSupplier;
import com.infogain.generics.dto.Tesla;
import com.infogain.generics.dto.TeslaRepairShop;

public class TargetTypesExample1 {

	public static void main(String[] args) {
		Mechanic<ElectricVehicle> electricVehicleMechanic = MechanicSupplier.unInitializedMechanic();
		Mechanic<Tesla> teslaMechanic = MechanicSupplier.<Tesla>unInitializedMechanic();
		// wont work with jdk<1.7
		// change compiler compilance to 1.7 to show demo
		TeslaRepairShop.repairTesla(MechanicSupplier.unInitializedMechanic(),
				new Tesla("Crimson Red", "DL2SP9221", 12, "Mirzapur Automobiles"));

		TeslaRepairShop.repairTesla(MechanicSupplier.<Tesla>unInitializedMechanic(),
				new Tesla("Post office Red", "DL2SP9222", 12, "Badlapur Automobiles"));
		TeslaRepairShop.repairTesla(teslaMechanic,
				new Tesla("Post office Red", "DL2SP9222", 12, "Wasseypur Automobile"));

	}
}
