package part2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// Creation of the Scanner and variables
		Scanner sc = new Scanner(System.in);
		// length and height will store the rectangle data
		double length;
		double height;
		// area will store the rectangles area
		double area;
		// perimeter will store the rectangles perimeter
		double perimeter;
		// Ask the user for the rectangles info
		System.out.println("Introduce the rectangles length:");
		length = sc.nextDouble();
		System.out.println("Introduce the rectangles height:");
		height = sc.nextDouble();
		// Calculation of the area and perimeter
		area = length * height;
		perimeter = area * 2;
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
		sc.close();
	}

}
