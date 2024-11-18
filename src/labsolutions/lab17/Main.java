package labsolutions.lab17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Fraction instances
        Fraction fraction1 = new Fraction(true, 3, 4);    // 3/4
        Fraction fraction2 = new Fraction(true, 2, 3);    // 2/3
        Fraction fraction3 = new Fraction(false, 3, 4);   // -3/4
        Fraction fraction4 = new Fraction(true, 3, 4);    // Another 3/4

        // Demonstrate the use of toString and comparison
        System.out.println("Fractions:");
        System.out.println("Fraction 1: " + fraction1); // Expected: 3/4
        System.out.println("Fraction 2: " + fraction2); // Expected: 2/3
        System.out.println("Fraction 3: " + fraction3); // Expected: -3/4
        System.out.println("Fraction 4: " + fraction4); // Expected: 3/4

        // Comparing fractions
        System.out.println("\nComparison:");
        System.out.println("Is Fraction 1 greater than Fraction 2? " + fraction1.isGreaterThan(fraction2)); // true
        System.out.println("Is Fraction 1 equal to Fraction 4? " + (fraction1.compareTo(fraction4) == 0)); // true
        System.out.println("Is Fraction 3 less than Fraction 2? " + (fraction3.compareTo(fraction2) < 0)); // true

        // Using ObjectCount to count Fraction occurrences
        ObjectCount<Fraction> fractionCount = new ObjectCount<>(fraction1);
        System.out.println("\nCounting occurrences of Fraction 1 (3/4):");

        // Increment count when the fraction matches fraction1
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction1);
        fractions.add(fraction2);
        fractions.add(fraction3);
        fractions.add(fraction4);

        for (Fraction f : fractions) {
            if (f.compareTo(fractionCount.getObject()) == 0) {
                fractionCount.incrementCount();
            }
        }

        System.out.println("Occurrences of " + fraction1 + ": " + fractionCount.getCount());

        // Demonstrating findGreatest method
        System.out.println("\nGreatest Fraction in the list: " + Fraction.findGreatest(fractions));
    }
}

/*
 Expected Output:
 
	Fractions:
	Fraction 1: 3/4
	Fraction 2: 2/3
	Fraction 3: -3/4
	Fraction 4: 3/4
	
	Comparison:
	Is Fraction 1 greater than Fraction 2? true
	Is Fraction 1 equal to Fraction 4? true
	Is Fraction 3 less than Fraction 2? true
	
	Counting occurrences of Fraction 1 (3/4):
	Occurrences of 3/4: 2
	
	Greatest Fraction in the list: 3/4

*/
