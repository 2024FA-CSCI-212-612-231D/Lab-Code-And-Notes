package labsolutions.lab21;

public class ComputerTester {
    public static void main(String args[]) {
    	// Create a Computer instance using the builder pattern
    	Computer myComputer = new Computer.Builder("Intel i7", 32)
    			.storage(1024)
    			.graphicsCard(true)
    			.bluetooth(true)
    			.build();
    	
    	// Print the details using the toString
    	System.out.println(myComputer);
    	
    }
}
