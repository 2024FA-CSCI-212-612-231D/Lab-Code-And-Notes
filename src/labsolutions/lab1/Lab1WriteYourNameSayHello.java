package labsolutions.lab1;
import java.util.Scanner;

public class Lab1WriteYourNameSayHello {

	public static void main(String[] args) {
        // Lab Instructions: 
		// Write a program that asks the user for their name, then says Hello with their name.

    	// TODO Lab Solution:
		// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Please enter your name: ");

        // Read the user's input and store it in a variable
        String name = scanner.nextLine();

        // Greet the user with their name
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();

	}

}
