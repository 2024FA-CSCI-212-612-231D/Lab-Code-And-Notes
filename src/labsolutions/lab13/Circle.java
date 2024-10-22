package labsolutions.lab13;

public class Circle extends Shape {
	
	private final double radius;

	public Circle(double radius) {
		super(2 * Math.PI * radius, Math.PI * radius * radius);
		this.radius = radius;
	}
	
	public boolean fitsInside(Circle otherCircle) {
		return radius < otherCircle.radius;
	}
	
	public boolean fitsInside(Rectangle rectangle) {
		return radius * 2 < rectangle.getBase() && radius * 2 < rectangle.getHeight();
	}

}