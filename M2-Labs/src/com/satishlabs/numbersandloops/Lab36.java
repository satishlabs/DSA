package com.satishlabs.numbersandloops;

/* 
36) Print the following Pattern 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
 
 */

public class Lab36 {
	public static void main(String[] args) {
		int stars = 5;
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			// Task1: Print Stars
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			// Task2: Print newLine
			System.out.println("");
		}

	}

}
