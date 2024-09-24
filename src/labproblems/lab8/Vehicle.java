package labproblems.lab8;

public class Vehicle {

	//fields: must be private in the package
	private int numWheels;
	private int numDoors;
	private String color;
	private double currentSpeed;
	
	//constructor: for creating the object
	public Vehicle(int numWheels, int numDoors, String color) {
		this.numWheels = numWheels;
		this.numDoors = numDoors;
		this.color = color;
	}
	
	//accessor (getter) method
	public int getNumWheels() {
		return numWheels;
	}
	
	//accessor (getter) method
	public int getNumDoors() {
		return numDoors;
	}
	
	//accessor (getter) method
	public String getColor() {
		return color;
	}
	
	//accessor (getter) method
	public double getSpeed() {
		return currentSpeed;
	}
	
	public void repaint(String newColor) {
		color = newColor;
	}
	
	public void changeSpeed(double change) {
		currentSpeed += change;
	}
	
	// toString method determines what gets printed when you print the object
	public String toString() {
		return "This " + color + " vehicle has " + numWheels + " wheels and " + numDoors + " doors.";
	}
	

	// TODO Add a method, isBig, to the Vehicle class. 
	// This method should return true if the vehicle has more 
	// than four wheels or more than four doors and false otherwise.
		
	
}