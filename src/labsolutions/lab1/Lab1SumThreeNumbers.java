package labsolutions.lab1;

// Import the Scanner Utility 
import java.util.Scanner;

public class Lab1SumThreeNumbers {

    public static void main(String[] args) {
        // Lab Instructions: 
    	// Write a program that asks the user for three integers, then outputs their sum in a sentence.
    	
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Please enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Please enter the third integer: ");
        int thirdNumber = scanner.nextInt();

        // Calculate the sum of the three integers
        int sum = firstNumber + secondNumber + thirdNumber;

        // Output the sum in a sentence
        System.out.println("The sum of " + firstNumber + ", " + secondNumber + ", and " + thirdNumber + " is " + sum + ".");

        // Close the scanner
        scanner.close();
    }
}
