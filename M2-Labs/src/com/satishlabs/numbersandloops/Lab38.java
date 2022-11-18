package com.satishlabs.numbersandloops;

/* 
38) Print the following Pattern 
	* 
	* * * 
	* * * * * 
	* * * * * * * 

*/

public class Lab38 {
	public static void main(String[] args) {
		int stars = 1; // Even and Odd Numbers
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			// Task1: Print Stars
			for (int j = 1; j <= stars; j++) {
				System.out.print(" *");

			}
			// Task2: Print newLine
			System.out.println("");
			stars = stars + 2;
		}

	}

}
