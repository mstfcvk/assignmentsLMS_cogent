package com.cognizant.shapes;

public class Circle {
	private float radius;
	private float pi =3.5f ;

	public Circle() {
		// invoking constructor 3 proble3 constructor chaining
		this(10f, 3.14f);
		radius = 1.5f;
		System.out.println(radius);
		//System.out.println("DF-Circle");
	}
	
	// overloaded constructor w different arg
	public Circle(float radius) {
		this.radius = radius;
	}
	
	// overloaded constructor w different args
		public Circle(float radius, float pi) {
			this.radius = radius;
			pi = 3.5f;
		}
		
	// method1
	double calculateCircleArea(float radius) {
		return ((pi)*radius*radius);
	}
	
	double calculateCircumference(float radius) {
		return (2*pi*radius);
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(1.5f, 3.5f);
		System.out.println(circle.calculateCircleArea(1.5f));
		System.out.println(circle.calculateCircumference(1.5f));
		
	}
}
