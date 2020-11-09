package com.main;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.service.Circle;
import com.service.Rectangle;
import com.service.Shape;
import com.service.Square;

public class CalculateArea {

	public static void main(String[] args) {

		System.out.println("Circle \nSquare \nRectangle");
		System.out.println("Enter the Shape name:");

		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		DecimalFormat decimalFormat = new DecimalFormat();

		if (name.equalsIgnoreCase("Circle")) {
			System.out.println("Enter radius : ");
			int radius = scan.nextInt();
			Circle circle = new Circle(name, radius);
			System.out.println("Area of " + circle.getName() + " is " + decimalFormat.format(circle.calculateArea()));

		} else if (name.equalsIgnoreCase("Square")) {
			System.out.println("Enter side : ");
			int side = scan.nextInt();
			Square square = new Square(name, side);
			System.out.println("Area of " + square.getName() + " is " + decimalFormat.format(square.calculateArea()));

		} else if (name.equalsIgnoreCase("Rectangle")) {
			System.out.println("Enter length : ");
			int length = scan.nextInt();
			System.out.println("Enter breadth : ");
			int breadth = scan.nextInt();
			Rectangle rectangle = new Rectangle(name, length, breadth);
			System.out.println("Area of " + rectangle.getName() + " is " + decimalFormat.format(rectangle.calculateArea()));

		}

	}

}
