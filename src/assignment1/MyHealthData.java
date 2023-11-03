/*
* Author: Sreelakshmi Odatt Venu 
* Student Numebr: 041093516
* Course: CST8284 – OOP
* Assignment: Assignment 1
* Date: 15/09/2023
* Professor: Veda Vasavi Erukulla
* Purpose: this is the MyHealthData Class 
 */

package assignment1;

/**
 * This is the  MyHealthData class which inherits from  the MyHealthDataBase class .
 * 
 * @author Sreelakshmi Odatt Venu
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthData
 */

public class MyHealthData extends MyHealthDataBase {
	/**
	 * declaring instance variables
	 */
	
	/**
	 * the firstName
	 */
	private String firstName;
	/**
	 * the lastName
	 */
	private String lastName;
	/**
	 * the gender
	 */
	private String gender;
	/**
	 * the birthYear
	 */
	private int birthYear;
	/**
	 * the currentYear
	 */
	private int currentYear;
	/**
	 * the height
	 */
	private double height;
	/**
	 * the weight
	 */
	private double weight;

	/**
	 * this constructor takes and sets values for the parameter such as the
	 * firstName , lastName , gender , height , weight , birthYear and currentYear
	 * 
	 * @param firstName   for the first name
	 * @param lastName    for the last name
	 * @param gender      for the gender
	 * @param height      for the height
	 * @param weight      for the weight
	 * @param birthYear   for the birth year
	 * @param currentYear for the current year
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear,
			int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}

	/**
	 * get method for the firstName
	 * 
	 * @return firstName of the user
	 */
	public String getFirstName() {
		return this.firstName;

	}

	/**
	 * set method for the firstName
	 * 
	 * @param firstName of the user
	 */
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * get method for the lastName
	 * 
	 * @return lastName of the user
	 */
	public String getLastName() {
		return this.lastName;

	}

	/**
	 * set method for the lastName
	 * 
	 * @param lastName of the user
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * get method for the gender
	 * 
	 * @return gender
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 * set method for the gender
	 * 
	 * @param gender of the user
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * get method for the birthYear
	 * 
	 * @return birthYear
	 */
	public int getBirthYear() {
		return this.birthYear;

	}

	/**
	 * set method for the birthYear
	 * 
	 * @param birthYear of the user
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * get method for the currentYear
	 * 
	 * @return currentYear
	 */
	public int getCurrentYear() {
		return this.currentYear;
	}

	/**
	 * get method for the height
	 * 
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * set method for the height
	 * 
	 * @param height of the user
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * get method for the weight
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * set method for the weight
	 * 
	 * @param weight of the user
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * get method for the currentYear-birthYear
	 * 
	 * @return currentYear-birthYear
	 */
	public int getAge() {
		return currentYear - birthYear;
	}

	/**
	 * this method return the maximumHeartRate
	 * 
	 * @return maximumHeartRate
	 */
	public double maximumHeartRate() {
		return 220 - getAge();
	}

	/**
	 * this method return minimumTargetHeartRate
	 * 
	 * @return minimumTargetHeartRate
	 */
	public double minimumTargetHeartRate() {
		return (double) (0.50 * maximumHeartRate());
	}

	/**
	 * this method return maximumTargetHeartRate
	 * 
	 * @return maximumTargetHeartRate
	 */
	public double maximumTargetHeartRate() {
		return (double) (0.85 * maximumHeartRate());
	}

	/**
	 * the displayMyHealthData method
	 */
	public void displayMyHealthData() {
		System.out.printf("FirstName: %s%n", firstName);
		System.out.printf("Last Name: %s%n", lastName);
		System.out.printf("Gender: %s%n", gender);
		System.out.printf("Year of birth: %d%n", birthYear);
		System.out.printf("Height: %.2f%n", height);
		System.out.printf("Weight : %.2f%n", weight);
		System.out.printf("Age in years : %d%n", getAge());
		System.out.printf("BMI Value: %.2f%n", calculateBMI(weight, height));
		System.out.printf("Maximum Heart Rate: %.2f%n", maximumHeartRate());
		System.out.printf("Target Heart Rate : (Minimum %.2f And Maximum %.2f)%n", minimumTargetHeartRate(),
				maximumTargetHeartRate());
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
	}

}