package labproblems.lab11;

// import arraylist

public class Fraction {
	
	private boolean positive;
	private int num;
	private int den;
	
	public boolean isPositive() {
		return positive;
	}

	public void setPositive(boolean positive) {
		this.positive = positive;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

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
	
	@Override 
	public String toString() {
		String out = "";
		if(!positive) {
			out = "-";
		}
		return out + num + "/" + den;
	}
	
	public double asDecimal() {
		double decimal = (double) num / den;
		if(!positive) {
			decimal *= -1;
		}
		return decimal;
	}
	
	public String asMixedNumber() {
		String out = "";
		if(!positive) {
			out = "-";
		}
		return out + num / den + " " + num % den + "/" + den;
	}
	
	//creates a new fraction instead of modifying this one
	public Fraction times(Fraction otherFraction) {
		boolean pos = positive == otherFraction.positive;
		int numerator = num * otherFraction.num;
		int denominator = den * otherFraction.den;
		return new Fraction(pos, numerator, denominator);
	}
	
	public Fraction plus(Fraction otherFraction) {
		// TODO finish the plus method by taking this instance of the fraction class
		// and adding it to the fraction being passed in as an argument

		
		
		// check if the numerator is positive or negative 
		if(numerator >= 0) {
			return new Fraction(true, numerator, denominator);
		}
		return new Fraction(false, -numerator, denominator);
	}
	
	public boolean isGreaterThan(Fraction otherFraction) {
		// TODO finish the isGreaterThan method by taking this instance of the fraction class
		// and checking it against the fraction being passed in as an argument

	}
	
	public static Fraction findGreatest(ArrayList<Fraction> fractions) {
		// TODO finish the findGreatest method that takes in an arraylist 
		// of fraction objects and returns the largest one 
		
	}

}
