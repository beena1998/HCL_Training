package com.service;

public  class Rectangle extends Shape {

	private int length;
	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	private int breadth;

	@Override
	public float calculateArea() {
		
		return length*breadth;

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
