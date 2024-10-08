package labsolutions.lab9;

public class Classroom {
	private int roomNumber;
	private int length;
	private int width;
	private boolean lightOn; // Note boolean values in Java are False by default 
	private boolean doorOpen;
	
	// Constructor with 3 parameters 
	public Classroom(int roomNumber, int length, int width) {
		this.roomNumber = roomNumber;
		this.length = length;
		this.width = width;
	}
	
	// accessor methods
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public boolean hasLightOn() {
		return lightOn; // will be false the first time this value is returned 
	}
	
	public boolean hasDoorOpen() {
		return doorOpen;
	}
	
	public int getSquareFootage() {
		return this.length * this.width;
	}
	

	// behavior methods
	public void flipLightSwitch() {
		this.lightOn = !lightOn;
	}
	
	public void openDoor() {
		this.doorOpen = true;
	}
	
	public void closeDoor() {
		this.doorOpen = false;
	}
	
	// toString method to print the details of the class 
	public String toString() {
		return "Classroom " + roomNumber + ": " + length + "x" + width + " feet";
	}

	// main method to test the Classroom class
	public static void main(String[] args) {
		Classroom room = new Classroom(101, 40, 60);

		System.out.println(room.getSquareFootage());
		System.out.println(room.hasLightOn());
		
		room.flipLightSwitch();
		System.out.println(room.hasLightOn());
		
		room.openDoor();
		System.out.println(room.hasDoorOpen());
		
		room.closeDoor();
		System.out.println(room.hasDoorOpen());
		
		System.out.println(room);
	}
}
