package labsolutions.lab6;

public class Lab6RotateMatrixSolution {
	/* Lab Problem:
	 * (Challenge Problem) Write a method that has a square 2D array 
	 * as a parameter that returns a 2D array of the same size, 
	 * but rotated 90 degrees clockwise.
	 */
	
	// TODO Lab Solution:
    public static int[][] rotate90Clockwise(int[][] array) {
        int size = array.length; // Get the size of the square array (number of rows)
        int[][] rotatedArray = new int[size][size]; // Create a new array to store the rotated elements

        // Loop through the array and place elements in the rotated positions
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedArray[j][size - 1 - i] = array[i][j];
            }
        }

        return rotatedArray;
    }

    // TODO: write a Main method to test your method
    public static void main(String[] args) {
        // Create a square 2D array for testing
        int[][] testArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the rotate method
        int[][] rotatedArray = rotate90Clockwise(testArray);

        // Print the rotated array
        System.out.println("Rotated 90 degrees clockwise:");
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}