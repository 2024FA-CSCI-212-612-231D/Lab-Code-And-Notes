package labproblems.lab8;

import java.util.ArrayList;

public class Fleet {
	
	private ArrayList<Vehicle> vehicles;
	
	// empty constructor
	public Fleet() {
		vehicles = new ArrayList<Vehicle>();
	}
	
	// constructor initialized with vehicles
	public Fleet(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	// class methods
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public int getSize() {
		return vehicles.size();
	}
	
	public int getTotalNumWheels() {
		int total = 0;
		for(Vehicle vehicle : vehicles) {
			total += vehicle.getNumWheels();
		}
		return total;
	}
	
	public int countMovingVehicles() {
		int total = 0;
		for(Vehicle vehicle : vehicles) {
			if(vehicle.getSpeed() > 0) {
				total++;
			}
		}
		return total;
	}
	
	public void paintAll(String color) {
		for(Vehicle vehicle : vehicles) {
			vehicle.repaint(color);
		}
	}
	

	// TODO Add a toString method to the Fleet class that 
	// returns the number of vehicles in the fleet along 
	// with a description of each vehicle.

	
	// TODO Add a method, getBigVehicleList, to the Fleet class. 
	// This method should use the isBig method to determine whether 
	// or not each vehicle in the fleet is big and return a list 
	// containing only the big vehicles in the fleet.
	

}
