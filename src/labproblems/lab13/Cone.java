package labproblems.lab13;

public class Cone extends Solid {
	
	private final double radius;
	private final double height;

	public Cone(double radius, double height) {
		super(Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height)), Math.PI * radius * radius * height / 3);
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}

}