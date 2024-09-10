package labproblems.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab4FileIOProblem {
	/*
	 * Lab Problem:
	 * 
	 * Run the FileIO class using your own input file. 
	 * (HINT: you need to replace the "inputFile.txt" with a real file pathway on your computer)
	 * */

	public static void main(String[] args) {
		//try-catch statement attempts to run code and avoids errors
		//try-catch (or throws) required for checked exceptions such as FileNotFoundException
		//this is try-with-resources
		try(Scanner input = new Scanner(new File("inputFile.txt"));
				PrintWriter output = new PrintWriter(new File("outputFile.txt"))) {
			while(input.hasNext()) {
				System.out.println(input.next());
			}
			output.append("Here is my output.");
		}catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}

}