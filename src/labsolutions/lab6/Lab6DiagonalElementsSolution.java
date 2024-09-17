package labsolutions.lab6;

public class Lab6DiagonalElementsSolution {
	/* Lab Problem:
	 * Write a method that has a square 2D array as the parameter. 
	 * The method returns a 1D array containing all the elements from the 
	 * diagonal from the top left to the bottom right of the 2D array.
	 */
	
	// TODO Lab Solution:	
    // Method to get the diagonal elements from a square 2D array
    public static int[] getDiagonalElements(int[][] array) {
        // Assuming the array is square, so the number of rows equals the number of columns
        int size = array.length;
        int[] diagonal = new int[size];

        // Loop to collect diagonal elements
        for (int i = 0; i < size; i++) {
            diagonal[i] = array[i][i];
        }

        return diagonal;
    }

    // TODO: write a Main method to test your method
    public static void main(String[] args) {
        // Create a square 2D array for testing
        int[][] testArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the method and store the diagonal elements
        int[] diagonal = getDiagonalElements(testArray);

        // Print the diagonal elements
        System.out.print("Diagonal elements: ");
        for (int element : diagonal) {
            System.out.print(element + " ");
        }
    }
}
