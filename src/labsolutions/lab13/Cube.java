package labsolutions.lab13;

public class Cube extends Solid {
	
	private final double sideLength;

	public Cube(double sideLength) {
		super(6 * sideLength * sideLength, sideLength * sideLength * sideLength);
		this.sideLength = sideLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

}