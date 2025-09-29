package part2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Creation of the Scanner and variables
		Scanner sc = new Scanner(System.in);
		// age is to store the users age
		int age;
		// year will store the year of the users birth
		int year;
		// Ask for the user age and store it
		System.out.println("Introduce the users age:");
		age = sc.nextInt();
		// Calculation of the year of birth and print on screen
		year = 2025 - age;
		System.out.println(year);
		sc.close();
	}

}
