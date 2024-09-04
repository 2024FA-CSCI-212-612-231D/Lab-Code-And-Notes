package labsolutions.lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2GuessingGame {
    // Lab Instructions:
	// Write a guessing game program. The program should pick a random integer from 1 to 100. Then it asks the user for a number and says too low, too high, or correct. The user should be able to keep entering numbers until he/she answers correctly.

	// TODO Lab Solution:
	
    public static void main(String[] args) {
 
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random integer between 1 and 100 (inclusive) using Math.random()
        int targetNumber = (int) (Math.random() * 100) + 1;
        
        /* ALT SOLUTION USING RANDOM 
        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random integer between 1 and 100 (inclusive)
        int targetNumber = random.nextInt(100) + 1;
        */

        int guess = 0; // Variable to store the user's guess

        // Loop until the user guesses the correct number
        while (guess != targetNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();

            // Check if the guess is too low, too high, or correct
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! The number was " + targetNumber + ".");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
