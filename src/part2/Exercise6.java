package part2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Creation of the scanner and variables
		Scanner sc = new Scanner(System.in);
		// studentsNumber will store the number of students
		int studentsNumber;
		// studentsSize will store the number of students in a group
		int studentsSize;
		// number is the groups number
		int number;
		// noTeam is the people without a team
		int noTeam;
		// Ask for the students number and the
		System.out.println("Insert number of students:");
		studentsNumber = sc.nextInt();
		System.out.println("Insert group size:");
		studentsSize = sc.nextInt();

		number = studentsNumber / studentsSize;
		noTeam = studentsNumber % studentsSize;
		System.out.println("You can form " + number + " groups.");
		System.out.println("Theres " + noTeam + " people without a team");

		sc.close();
	}

}
