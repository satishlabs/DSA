package com.satishlabs.numbersandloops;

/* 
40) Print the following Pattern 
 	  * 
 	* * * 
  * * * * * 
 * * * * * * * 

*/

public class Lab41 {
	public static void main(String[] args) {
		int stars = 1;
		int rows = 4; // Odd Numbers
		int spaces = 15;

		for (int i = 1; i <= rows; i++) {
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
	}

}
