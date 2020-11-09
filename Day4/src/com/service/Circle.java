package com.service;

public class Circle extends Shape {
	private int radius;

	@Override
	public float calculateArea() {

		return (float) ((float) 3.14 * Math.pow(radius, 2));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

}
