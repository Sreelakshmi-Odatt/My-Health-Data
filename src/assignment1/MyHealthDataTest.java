/*
*Author: Sreelakshmi Odatt Venu 
* Date: 15/09/2023
 */
package assignment1;

import java.time.Year;
import java.util.Scanner;

/**
 * This class accepts details from the  user and returns the health details of
 * the user .
 * 
 * @author Sreelakshmi Odatt Venu
 * @version 1.0
 * @since javac 17.0.7
 * @see java.time.Year
 */

public class MyHealthDataTest {
	/**
	 * entry point of the program the method main
	 * 
	 * @param args the command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/**
		 * collecting informations from the user
		 */
		System.out.println("Enter the patients first name");
		String firstName = scanner.nextLine();

		System.out.println("Enter the patients last name");
		String lastName = scanner.nextLine();

		System.out.println("Enter the patients gender");
		String gender = scanner.nextLine();

		System.out.println("Enter the patients birthYear");
		int birthYear = scanner.nextInt();

		System.out.println("Enter the patients height");
		double heightParam = scanner.nextDouble();

		System.out.println("Enter the patients weight");
		double weightParam = scanner.nextDouble();

		int currentYear = Year.now().getValue();

		MyHealthData myHealth = new MyHealthData(firstName, lastName, gender, heightParam, weightParam, birthYear,
				currentYear);

		myHealth.displayMyHealthData();

		scanner.close();
	}

}
