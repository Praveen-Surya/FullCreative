package org.full.polymorphism;

public class Circle extends Shape {

	double radius = 1.5;

	@Override
	void area() {

		double circleArea = 3.14 * radius * radius;
		System.out.println("Area of Circle " + circleArea);
	}

}
