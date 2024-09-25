package labsolutions.lab8;

import java.util.ArrayList;

public class Fleet {
	
	private ArrayList<Vehicle> vehicles;
	
	// constructor
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
	public String toString() {
		String toReturn = vehicles.size() + " vehicles:\n";
		for(Vehicle vehicle : vehicles) {
			toReturn += vehicle + "\n";
		}
		return toReturn;
	}
	
	// TODO Add a method, getBigVehicleList, to the Fleet class. 
	// This method should use the isBig method to determine whether 
	// or not each vehicle in the fleet is big and return a list 
	// containing only the big vehicles in the fleet.
	public ArrayList<Vehicle> getBigVehicleList(){
		ArrayList<Vehicle> bigVehicles = new ArrayList<Vehicle>();
		for(Vehicle vehicle : vehicles) {
			if(vehicle.isBig()) {
				bigVehicles.add(vehicle);
			}
		}
		return bigVehicles;
	}

}