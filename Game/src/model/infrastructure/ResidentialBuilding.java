package model.infrastructure;

import java.util.ArrayList;

import model.disasters.Disaster;
import model.people.Citizen;
import simulation.Address;
import simulation.Rescuable;
import simulation.Simulatable;

public class ResidentialBuilding implements Simulatable,Rescuable {
	private Address location;
	private int structuralIntegrity;
	private int fireDamage;
	private int gasLevel;
	private int foundationDamage;
ArrayList<Citizen> occupants;
Disaster diasaster;

	public ResidentialBuilding(Address location){
		this.location=location;
		this.structuralIntegrity= 100;
		this.fireDamage=0;
		this.gasLevel=0;
		this.foundationDamage=0;
	}

	public Address getLocation() {
		return location;
	}

	public int getStructuralIntegrity() {
		return structuralIntegrity;
	}

	public int getFireDamage() {
		return fireDamage;
	}

	public int getGasLevel() {
		return gasLevel;
	}

	public void setStructuralIntegrity(int structuralIntegrity) {
		this.structuralIntegrity = structuralIntegrity;
	}

	public void setFireDamage(int fireDamage) {
		this.fireDamage = fireDamage;
	}

	public void setGasLevel(int gasLevel) {
		this.gasLevel = gasLevel;
	}

	public void setFoundationDamage(int foundationDamage) {
		this.foundationDamage = foundationDamage;
	}

	public int getFoundationDamage() {
		return foundationDamage;
	}

	public ArrayList<Citizen> getOccupants() {
		return occupants;
	}

	public Disaster getDiasaster() {
		return diasaster;
	}
}
