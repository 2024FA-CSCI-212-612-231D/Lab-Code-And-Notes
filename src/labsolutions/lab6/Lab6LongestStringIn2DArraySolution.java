package labsolutions.lab6;

public class Lab6LongestStringIn2DArraySolution {
	/* Lab Problem:
	 * Write a method that has a 2D array of 
	 * Strings as a parameter that returns the 
	 * length of the longest String in the array.
	 */
	
	// TODO Lab Solution:
	public static int findLongestStringLength(String[][] array) {
        int maxLength = 0;

        // Traverse through the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Check if the current string is longer than the current maximum
                if (array[i][j] != null && array[i][j].length() > maxLength) {
                    maxLength = array[i][j].length();
                }
            }
        }

        return maxLength;
    }

    // TODO: write a Main method to test your method
    public static void main(String[] args) {
        // Create a 2D array of Strings for testing
//        String[][] arr = {
//            {"apple", "banana", null},
//            {"blueberry", "peach", "strawberry"},
//            {"grape", "orange", "watermelon"}
//        };

        // Call the method and print the result
//        int longestLength = findLongestStringLength(arr);
//        System.out.println("The length of the longest string is: " + longestLength);
        String[][] arr = {{"One", "Two", "Three"}, {"Four", "Five", "Six"}};
        System.out.println("\n printng array: \n");      
        for (int i = 0; i < arr.length; i++){
        	for (int j = 0; j < arr[i].length; j++){
        	System.out.print(arr[i][j]);
        	}
        	System.out.println();
        	 }

    }
}

