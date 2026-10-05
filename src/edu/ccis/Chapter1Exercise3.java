/**
 * Assignment 3: Calculate miles to kilometers
 * Course: CCIS238
 * Student: Morgan Williams
 * Date: 9/2/2026
 */
package edu.ccis;
import java.util.Scanner;

public class Chapter1Exercise3 {

	public static void main(String[] args) {
		// prompt user for miles driven
		System.out.println("Enter the number of miles driven today:");
		// store the input in a variable after creating a Scanner object
		Scanner input = new Scanner(System.in);
		double milesDriven = input.nextDouble();
		// convert the term from miles to kilometers
		double kilometersDriven = milesDriven * 1.60934;
		System.out.println("Miles driven: " + milesDriven);
		System.out.println("Kilometers driven: " + kilometersDriven);
		input.close();
		

	}

}