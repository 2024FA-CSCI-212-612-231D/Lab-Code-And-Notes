package labsolutions.lab7;
import java.util.ArrayList;

public class Lab7BooleanTrueCountSolution {
	/* Lab Problem:
	 * Write a method that has an ArrayList of Booleans as a parameter 
	 * that returns the number of true elements.
	 */
	
	// TODO Lab Solution:
    // Method to count the number of true elements in the ArrayList
    public static int countTrueElements(ArrayList<Boolean> booleanList) {
        int count = 0;
        
        // Traverse the ArrayList and count the number of true values
        for (int i = 0; i < booleanList.size(); i++) {
        	// if booleanList.get(i) returns true, the condition is true
            if (booleanList.get(i)) {
                count++;
            }
        }

        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test ArrayList of Booleans
        ArrayList<Boolean> testList = new ArrayList<>();
        testList.add(true);
        testList.add(false);
        testList.add(true);
        testList.add(false);
        testList.add(true);

        // Call the method and print the result
        int trueCount = countTrueElements(testList);
        System.out.println("Number of true elements: " + trueCount);
    }
}
