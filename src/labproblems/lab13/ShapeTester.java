package labproblems.lab13;

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
		
		/* TODO: 
		 * Test your Circle class by creating two new circle instances 
		 * called circle1 and circle 2, with parameters 4 and 6 respectfully 
		*/ 

		/* TODO:
		 * print the results from checking if 
		 * 1) circle 1 fits inside circle 2
		 * 2) if circle1 fits inside rec1
		 * 3) if circle 1 fits inside square1
		*/

		
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