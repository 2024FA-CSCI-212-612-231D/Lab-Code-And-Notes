package labsolutions.lab2;

public class Lab2SumTheDigits {
	// Lab Instructions:
	// Write a static method that has an integer as a parameter and returns the sum of the digits in that number. Then write code in a main method to test it.

	// TODO Lab Solution:
	
    // Static method to calculate the sum of the digits of an integer
    public static int sumDigits(int number) {
        int sum = 0;

        // Process each digit in the number
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases for the sumDigits method
        int testNumber1 = 12345;
        int testNumber2 = 9876;
        int testNumber3 = 1001;

        // Print the results
        System.out.println("The sum of the digits in " + testNumber1 + " is: " + sumDigits(testNumber1));
        System.out.println("The sum of the digits in " + testNumber2 + " is: " + sumDigits(testNumber2));
        System.out.println("The sum of the digits in " + testNumber3 + " is: " + sumDigits(testNumber3));
    }


}
