package org.full.polymorphism;

public class Triangle extends Shape {

	double height = 1.5, base = 2.75;

	void area() {

		double triangleArea = 0.5 * height * base;
		System.out.println("Area of Triangle " + triangleArea);
	}

	void perimeter() {
		System.out.println("Perimeter of Triangle");
	}

	public static void main(String[] args) {

		Shape shape = new Triangle();
		shape.area();

	}
}
