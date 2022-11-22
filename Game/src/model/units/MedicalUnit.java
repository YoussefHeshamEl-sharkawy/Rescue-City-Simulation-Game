package model.units;

import model.people.Citizen;
import simulation.Address;

public class MedicalUnit extends Unit {
	private int healingAmount;
	private int treatmentAmount;

	public MedicalUnit(String id, Address location, int stepsPerCycle) {
		super(id, location, stepsPerCycle);
		this.healingAmount = 10;
		this.treatmentAmount = 10;
	}

}
