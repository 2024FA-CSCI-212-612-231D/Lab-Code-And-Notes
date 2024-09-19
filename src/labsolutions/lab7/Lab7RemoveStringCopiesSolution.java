package labsolutions.lab7;

//what should be imported?
import java.util.ArrayList;

public class Lab7RemoveStringCopiesSolution {
	/* Lab Problem:
	 * Write a method that has an ArrayList of Strings and a String as parameters. 
	 * It should remove all copies of that String from the list, 
	 * then return the number of copies removed.
	 */
	
	// TODO Lab Solution:
	// Method to remove all copies of a specific String from the ArrayList
	public static int removeAllCopies(ArrayList<String> stringList, String target) {
	    int count = 0;

	    // Use a loop to remove all instances of the target string
	    while (stringList.remove(target)) {
	        count++;
	    }
	
	    return count;
	}

	// Main method to test the function
	public static void main(String[] args) {
	    // Test ArrayList of Strings
	    ArrayList<String> testList = new ArrayList<>();
	    testList.add("apple");
	    testList.add("banana");
	    testList.add("apple");
	    testList.add("orange");
	    testList.add("apple");
	
	    // Target string to remove
	    String target = "apple";
	
	    // Call the method and print the result
	    int removedCount = removeAllCopies(testList, target);
	    System.out.println("Number of copies removed: " + removedCount);
	    
	    // notice unlike arrays[], which you have to loop through to print,
	    // you can directly print an ArrayList object: 
	    System.out.println("Updated ArrayList: " + testList);
	}
}