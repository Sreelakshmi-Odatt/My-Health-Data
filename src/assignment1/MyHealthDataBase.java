/*
* Author: Sreelakshmi Odatt Venu 
* Student Number: 041093516
* Course: CST8284 – OOP
* Assignment: Assignment 1
* Date: 15/09/2023
* Professor: Veda Vasavi Erukulla
* Purpose: to calculate the correct and incorrect BMI 
 */
package assignment1;

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health
 * Records (EHR) System, also known as Assignment 1. It contains a method to
 * calculate BMI and will contain other methods.
 * 
 * @author Sreelakshmi Odatt Venu
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthData
 */
public class MyHealthDataBase {
	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * Weight in pounds and height in pounds
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return calculateBMI returns calculatebmi
	 */
	public double calculateBMI(double weightParam, double heightParam) {
		return weightParam * 703 / (heightParam * heightParam);

	}

	/**
	 * This method returns the incorrect Body Mass Index (BMI) from data provided.
	 * Weight in pounds and height in pounds
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return incorrectBMI returns incorrectBMI.
	 */
	public double incorrectBMI(double weightParam, double heightParam) {
		return heightParam * 703 / (heightParam * heightParam);

	}
}
