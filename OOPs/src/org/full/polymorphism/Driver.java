package org.full.polymorphism;

//Run Time Polymorphism

public class Driver {

	public static void callArea(Shape a) {
		a.area();

	}

	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		triangle.area();

		Circle circle = new Circle();
		circle.area();

		Shape s = new Circle();
		s.area();

		callArea(triangle);
		callArea(circle);

	}

}