package labsolutions.lab11;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Fraction a = new Fraction(true, 1, 2);
		Fraction b = new Fraction(true, 1, 3);
		
		System.out.println(a.plus(b));
		System.out.println(a.isGreaterThan(b));
		System.out.println(b.isGreaterThan(a));
		
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		
		fractions.add(a);
		fractions.add(b);
		
		System.out.println(Fraction.findGreatest(fractions));
	}

}