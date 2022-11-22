package simulation;

import java.util.ArrayList;

import model.disasters.Disaster;
import model.infrastructure.ResidentialBuilding;
import model.people.Citizen;
import model.units.Unit;

public class Simulator {
	private int currentCycle;
	private ArrayList<ResidentialBuilding> buildings;
	private ArrayList<Citizen> citizens;
	private ArrayList<Unit> emergencyUnits;
	private ArrayList<Disaster> plannedDisasters;
	private ArrayList<Disaster> excecutedDisasters;
	private Address[][] world;

	public Simulator() {
		// this.world = new Address [10] [10]; //TODO:not sure
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				world[i][j] = new Address(i, j);
			}
		}
	}
}