package labproblems.lab21;

public class ComputerTester {
 public static void main(String[] args) {
     // Create a Computer instance using the constructor 
	 // of the original class which doesn't use the builder pattern
     Computer myComputer = new Computer("Intel i5", 16, 512, true, false);
     
     // Print out the details
     System.out.println(myComputer);
 }
}