package labproblems.lab13;

public class Sphere extends Solid {
	
	private final double radius;

	public Sphere(double radius) {
		super(4 * Math.PI * radius * radius, 4 / 3.0 * Math.PI * radius * radius * radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

}