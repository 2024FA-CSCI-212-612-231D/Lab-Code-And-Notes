package labsolutions.lab13;

import java.util.ArrayList;

public class ShapeTester {

	public static void main(String[] args) {
		Shape shape1 = new Shape(6, 3);
		System.out.println(shape1.getArea());
		System.out.println(isBig(shape1));
		
		Rectangle rec1 = new Rectangle(6, 3);
		System.out.println(rec1.getArea()); //getArea is inherited from Shape
		System.out.println(rec1.getBase());
		System.out.println(isBig(rec1)); //polymorphism allows us to pass a Rectangle to isBig
		
		Square square1 = new Square(4);
		System.out.println(square1.getArea()); //getArea is inherited from Rectangle which inherits it from Shape
		
		Circle circle1 = new Circle(4);
		
		Circle circle2 = new Circle(6);
		System.out.println(circle1.fitsInside(circle2));
		System.out.println(circle1.fitsInside(rec1));
		System.out.println(circle1.fitsInside(square1));
		
		//polymorphism allows us to store Rectangles and Squares in ArrayList of Shapes
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(shape1);
		shapes.add(rec1);
		shapes.add(square1);
		shapes.add(circle1);
		
		double totalArea = 0;
		for(int i = 0; i < shapes.size(); i++) {
			totalArea += shapes.get(i).getArea();
		}
		System.out.println(totalArea);
	}
	
	public static boolean isBig(Shape shape) {
		return shape.getArea() > 10;
	}

}