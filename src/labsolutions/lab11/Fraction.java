package labsolutions.lab11;

import java.util.ArrayList;

public class Fraction {
	
	private boolean positive; // stores the actual sign of the fraction
	private int num;
	private int den;
	
	//Precondition: numerator and denominator are positive
	public Fraction(boolean isPositive, int numerator, int denominator) {
		positive = isPositive;
		num = numerator;
		den = denominator;
		simplify();
	}
	
	//private helper method: can only be called from inside the class
	private void simplify() {
		int gcd = gcd(num, den);
		num /= gcd;
		den /= gcd;
	}
	
	//static method: associated with the class, not the object
	//cannot use fields but can be used without creating object
	public static int gcd(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		while(big % small != 0) {
			int remainder = big % small;
			big = small;
			small = remainder;
		}
		return small;
	}
	
	public String toString() {
		String out = "";
		if(!positive) { // if it's a negative value print "-"
			out = "-";
		}
		return out + num + "/" + den;
	}
	
	public double asDecimal() {
		double decimal = (double) num / den;
		if(!positive) { // if it's a negative value multiply by -1
			decimal *= -1;
		}
		return decimal;
	}
	
	public String asMixedNumber() {
		String out = "";
		if(!positive) { // if it's a negative value print "-"
			out = "-";
		}
		return out + num / den + " " + num % den + "/" + den;
	}
	
	//creates a new fraction instead of modifying this one
	public Fraction times(Fraction otherFraction) {
		boolean pos = positive == otherFraction.positive; // result is positive if both have the same sign
		int numerator = num * otherFraction.num;
		int denominator = den * otherFraction.den;
		return new Fraction(pos, numerator, denominator);
	}
	
	public Fraction plus(Fraction otherFraction) {
		int num1 = num * otherFraction.den;
		if(!positive) {
			num1 *= -1;
		}
		
		int num2 = otherFraction.num * den;
		if(!otherFraction.positive) {
			num2 *= -1;
		}
		
		int numerator = num1 + num2;
		
		int denominator = den * otherFraction.den;
		
		if(numerator >= 0) {
			return new Fraction(true, numerator, denominator);
		}
		return new Fraction(false, -numerator, denominator);
	}
	
	public boolean isGreaterThan(Fraction otherFraction) {
		int num1 = num * otherFraction.den;
		if(!positive) {
			num1 *= -1;
		}
		int num2 = otherFraction.num * den;
		if(!otherFraction.positive) {
			num2 *= -1;
		}
		return num1 > num2;
	}
	
	public static Fraction findGreatest(ArrayList<Fraction> fractions) {
		Fraction greatest = fractions.get(0);
		for(Fraction fraction : fractions) {
			if(fraction.isGreaterThan(greatest)) {
				greatest = fraction;
			}
		}
		return greatest;
	}

}