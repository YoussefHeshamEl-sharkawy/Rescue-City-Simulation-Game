package model.units;

import simulation.Address;
import simulation.Rescuable;
import simulation.Simulatable;

public class Unit implements Simulatable {

	private String unitID;
	private UnitState state;
	private Address location;
	private Rescuable target;
	private int distanceToTarget;
	private int stepsPerCycle;

	public Unit(String id, Address location, int stepsPerCycle) {
		this.unitID = id;
		this.location = location;
		this.stepsPerCycle = stepsPerCycle;
		this.state = UnitState.IDLE;

	}

	public String getUnitID() {
		return unitID;
	}

	public UnitState getState() {
		return state;
	}

	public Address getLocation() {
		return location;
	}

	public Rescuable getTarget() {
		return target;
	}

	public int getStepsPerCycle() {
		return stepsPerCycle;
	}

	public void setState(UnitState state) {
		this.state = state;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

}
