package com.satishlabs.numbersandloops;

/* 
37) Print the following Pattern 
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
*/

public class Lab37 {
	public static void main(String[] args) {
		int stars = 1;
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			// Task1: Print Stars
			for (int j = 1; j <= stars; j++) {
				System.out.print(" *");

			}
			// Task2: Print newLine
			System.out.println("");
			stars++;
		}

	}

}
