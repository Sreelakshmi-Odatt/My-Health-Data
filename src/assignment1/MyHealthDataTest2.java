/*
*Author: Sreelakshmi Odatt Venu 
*Student Number: 041093516
* Course: CST8284 – OOP
* Assignment: Assignment 1
* Date: 15/09/2023
* Professor: Veda Vasavi Erukulla
* Purpose: JUnit test for the class MyHealthData 
 */
package assignment1;

import java.time.Year;

import org.junit.Assert;
import org.junit.Test;

/*
 * In  the correctBMI method , the expected bmi matches with the calcualted value since the equation is correct 
 * But in the incorrectBMI method , the equation is wrong(the equation should be weightParam * 703 / (heightParam * heightParam);), so the expected  value does not match with the calculted bmi 
 * so the test fails 
 */

/**
 * This is the unit testing for MyhealthData class
 * 
 */
public class MyHealthDataTest2 {
	/**
	 * epsilon value
	 */
	public static final double EPSILON = 1E-12;

	/**
	 * Successful test for calculateBMI
	 */
	@Test
	public void testCalculateBMI() {
		String firstName = "Sreelakshmi";
		String lastName = "Odatt Venu";
		String gender = "Female";
		int birthYear = 2004;
		int currentYear = Year.now().getValue();
		double weightParam = 150.0;
		double heightParam = 63.0;
		MyHealthData myHealthData = new MyHealthData(firstName, lastName, gender, weightParam, heightParam, birthYear,
				currentYear);
		double actualBMI = myHealthData.calculateBMI(weightParam, heightParam);
		double expectedcalculatedBMI = 26.56840513983371;
		Assert.assertEquals(expectedcalculatedBMI, actualBMI, EPSILON);
	}

	/**
	 * IncorrectBMI , faied Test
	 */
	@Test
	public void testIncorrectBMI() {
		String firstName = "Sreelakshmi";
		String lastName = "Odatt Venu";
		String gender = "Female";
		int birthYear = 2004;
		int currentYear = Year.now().getValue();
		double weightParam = 150.0;
		double heightParam = 63.0;
		MyHealthData myHealthData = new MyHealthData(firstName, lastName, gender, weightParam, heightParam, currentYear,
				birthYear);
		double actualBMI = myHealthData.incorrectBMI(weightParam, heightParam);
		double expectedcalculatedBMI = 26.56840513983371;
		Assert.assertEquals(expectedcalculatedBMI, actualBMI, EPSILON);
	}
}
