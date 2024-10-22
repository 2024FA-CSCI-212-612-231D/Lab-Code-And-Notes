package labsolutions.lab13;

public class Solid {
	
	private final double surfaceArea;
	private final double volume;
	
	public Solid(double surfaceArea, double volume) {
		this.surfaceArea = surfaceArea;
		this.volume = volume;
	}
	
	public double getSurfaceArea() {
		return surfaceArea;
	}
	
	public double getVolume() {
		return volume;
	}

}