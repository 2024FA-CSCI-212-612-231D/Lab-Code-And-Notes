package labproblems.lab13;

public class Rectangle extends Shape {
	
	private final double base;
	private final double height;
	
	public Rectangle(double base, double height) {
		super(2 * base + 2 * height, base * height); //calls Shape constructor
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}

}