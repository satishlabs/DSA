package com.satishlabs.numbersandloops;

/* 
41) Print the following Pattern 
		* 
	  * * * 
	* * * * * 
  * * * * * * * 
	* * * * * 
	  * * * 
	    * 

*/

public class Lab40 {
	public static void main(String[] args) {
		int stars = 1;
		int rows = 7; // Odd Numbers
		int spaces = 25;

		for (int i = 1; i <= rows / 2 + 1; i++) {
			// Task1: Print Spaces
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// Task2: Print stars
			for (int k = 1; k <= stars; k++) {
				System.out.print(" *");
			}

			// Task3: Print newLine
			System.out.println("");
			spaces = spaces - 2;
			stars = stars + 2;
		}

		for (int i = 1; i <= rows; i++) {
			// Task1: Print spaces
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// Task2: Print Stars
			for (int k = 1; k <= stars; k++) {
				System.out.print(" *");
			}

			// Task3: Print newLine
			System.out.println("");
			spaces = spaces + 2;
			stars = stars - 2;
		}
	}

}
