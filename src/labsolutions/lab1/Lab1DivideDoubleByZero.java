package labsolutions.lab1;

public class Lab1DivideDoubleByZero {

    public static void main(String[] args) {
        // Lab Instructions: 
    	// Write a program to determine what happens if you divide a double by 0.
        
    	// Lab Solution: 
        double numerator = 10.0;
        double denominator = 0.0;

        // Perform the division
        double result = numerator / denominator;

        // Print the result
        System.out.println("Result of dividing " + numerator + " by " + denominator + " is: " + result);

        // Check and print if the result is Infinity or NaN
        if (Double.isInfinite(result)) {
            System.out.println("The result is Infinity.");
        } else if (Double.isNaN(result)) {
            System.out.println("The result is NaN (Not a Number).");
        } else {
            System.out.println("The result is a finite number.");
        }
    }
}
