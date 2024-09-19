package labsolutions.lab7;

import java.util.ArrayList;

public class Lab7RemoveEvenIndicesSolution {
	/* Lab Problem:
	 * Write a void method that removes all elements 
	 * in even indices from an ArrayList.
	 * Then print the updated ArrayList.
	 */
	
	// TODO Lab Solution:
    // Method to remove elements at even indices from the ArrayList
    public static void removeElementsAtEvenIndices(ArrayList<Integer> numberList) {
        // Traverse the ArrayList in reverse order to avoid index shifting issues
    	// otherwise you'll have to decrement i after removing the element 
        for (int i = numberList.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) { // Check if the index is even
                numberList.remove(i);
            }
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test ArrayList of Integers
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        testList.add(40);
        testList.add(50);
        testList.add(60);

        // Call the method and print the updated list
        removeElementsAtEvenIndices(testList);
        System.out.println("Updated ArrayList after removing even indices: " + testList);
    }
}
