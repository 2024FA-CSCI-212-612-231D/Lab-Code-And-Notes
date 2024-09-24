package labproblems.lab8;

public class VehicleRunner {

	public static void main(String[] args) {
		//use constructor to make a vehicle named "car"
		Vehicle car = new Vehicle(4, 4, "Red"); 
		System.out.println(car.getNumWheels());
		System.out.println(car.getSpeed());
		
		//use constructor to make a vehicle named "truck"
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
		
		/*
		 println(car) below uses the toString method implicitly.
		 Whenever you try to print an object (or concatenate an object to a string), 
		 Java automatically calls the object's toString() method to convert the 
		 object into a string representation. 
		 
		 If you have overridden the toString() method in your class, 
		 that custom string representation will be used. 
		 If you don't override toString(), the default implementation provided by 
		 the Object class will be used, which typically returns something like:
		 	ClassName@HashCode
		 * */
		System.out.println(car);
		System.out.println(truck);
		
		// TODO Test the Fleet class and its methods
		// i.e. add the vehicles and perform some actions 

	}

}
