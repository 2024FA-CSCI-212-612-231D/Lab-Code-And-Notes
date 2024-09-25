package labsolutions.lab8;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4, 4, "Red"); //use constructor to make a vehicle
		System.out.println(car.getNumWheels());
		System.out.println(car.getSpeed());
		
		Vehicle truck = new Vehicle(18, 2, "White");
		System.out.println(truck.getNumWheels());
		System.out.println(truck.getSpeed());
		
		System.out.println(car.getColor());
		car.repaint("Blue");
		System.out.println(car.getColor());
		
		System.out.println(truck.getSpeed());
		truck.changeSpeed(80);
		System.out.println(truck.getSpeed());
		truck.changeSpeed(-10);
		System.out.println(truck.getSpeed());
		
		//use toString method implicitly
		System.out.println(car);
		System.out.println(truck);
		
		Fleet fleet = new Fleet();
		System.out.println(fleet.getSize());
		fleet.addVehicle(truck);
		fleet.addVehicle(car);
		System.out.println(fleet.getSize());
		System.out.println(fleet.getTotalNumWheels());
		System.out.println(fleet.countMovingVehicles());
		
		fleet.paintAll("Gray");
		System.out.println(car.getColor());
		System.out.println(truck.getColor());
		
		System.out.println(fleet);
		System.out.println(fleet.getBigVehicleList());
	}

}