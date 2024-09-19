package labproblems.lab7;

// TODO what should be imported?

public class Lab7BooleanTrueCountProblem {
	/* Lab Problem:
	 * Write a method that has an ArrayList of Booleans as a parameter 
	 * that returns the number of true elements.
	 */
	
	// TODO Lab Solution:
    // Method to count the number of true elements in the ArrayList
    public static int countTrueElements(ArrayList<Boolean> booleanList) {
    	// add code here
    }

    // Example of main method to test the function
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
