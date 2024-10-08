package labsolutions.lab10;

import labsolutions.lab9.Classroom;

public class School {
	
	private Classroom[] rooms;
	
	public School(Classroom[] rooms) {
		this.rooms = rooms;
	}
	
	public Classroom getLargestRoom() {
		Classroom largest = rooms[0];
		for(int i = 1; i < rooms.length; i++) {
			if(rooms[i].getSquareFootage() > largest.getSquareFootage()) {
				largest = rooms[i];
			}
		}
		return largest;
	}
	
	public int countRoomsWithLightsOn() {
		int count = 0;
		for(Classroom room : rooms) {
			if(room.hasLightOn()) {
				count++;
			}
		}
		return count;
	}
	
	public void closeAllDoors() {
		for(Classroom room : rooms) {
			room.closeDoor();
		}
	}

}