package labsolutions.lab13;

public class Shape {
	
	private final double perimeter;
	private final double area;
	
	public Shape(double perimeter, double area) {
		this.perimeter = perimeter;
		this.area = area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}

}