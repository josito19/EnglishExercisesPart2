package part2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// Creation of the scanner and variables
		Scanner sc = new Scanner(System.in);
		// pounds is to store the pounds
		double pounds;
		// kilos stores the value in kilos
		double kilos;

		// Ask for value in pounds and store it
		System.out.println("Introduce value in pounds:");
		pounds = sc.nextDouble();
		kilos = pounds / 2.2;
		// Print on screen the value in kilos and then close the scanner
		System.out.println(kilos);

		sc.close();
	}

}
