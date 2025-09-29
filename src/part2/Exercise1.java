package part2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Creation of the scanner and variables
		Scanner sc = new Scanner(System.in);
		// price is where the price is going to be stored
		double price;
		// tax is where the tax is going to be stored
		double tax;
		// print on screen the program title
		System.out.println("Program Title");
		// Ask for the price and store it
		System.out.println("Enter a price");
		price = sc.nextDouble();
		// Ask for tax and store it
		System.out.println("Enter a tax");
		tax = sc.nextDouble();
		price *= (1 + tax / 100);
		// print the new price and close the scanner
		System.out.println(price);

		sc.close();
	}

}
