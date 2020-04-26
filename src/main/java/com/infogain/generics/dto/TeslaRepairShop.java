package com.infogain.generics.dto;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class TeslaRepairShop extends RepairShop {

	public static void repairTesla(Mechanic<Tesla> mechanic, Tesla tesla) {
		if (StringUtils.isBlank(mechanic.getName())) {
			mechanic.setName("KALEEN BHAYA");
		}
		
//wont work with jdk<1.7
		//change compiler compilance to 1.7 to show demo
		assignVehicleToMechanicAndRecordTransaction(mechanic.getName(), tesla, new ArrayList<>());
	}
}
