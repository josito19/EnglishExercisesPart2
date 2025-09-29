package part2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Creation of the scanner and variables
		Scanner sc = new Scanner(System.in);
		// weight and height are our variables to store the users data
		double weight;
		double height;
		// bmi stores the calculation of the users BMI
		double bmi;
		// Ask for weight and height and store them
		System.out.println("Introduce your weight in kg:");
		weight = sc.nextDouble();
		System.out.println("Introduce your height in meters:");
		height = sc.nextDouble();
		// Calculation of the users BMI
		bmi = weight / Math.pow(height, 2);
		System.out.println(bmi);

		sc.close();
	}

}
