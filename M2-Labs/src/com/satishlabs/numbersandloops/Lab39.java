package com.satishlabs.numbersandloops;

/* 
39) Print the following Pattern 
	 *
	 * *
	 * * *
	 * * * *
	 * * *
	 * *
	 *

*/

public class Lab39 {
	public static void main(String[] args) {
		int stars = 1; 
		int rows = 7; //Odd Numbers

		for (int i = 1; i <= rows/2+1; i++) {
			// Task1: Print Stars
			for (int j = 1; j <= stars; j++) {
				System.out.print(" *");

			}
			// Task2: Print newLine
			System.out.println("");
			stars++;
		}
		stars = rows/2;
		
		for(int i=1; i<=rows/2; i++) {
			//Task1: Print Stars
			for(int j=1; j<=stars; j++) {
				System.out.print(" *");
			}
			
			//Task2: Print newLine
			System.out.println("");
			stars--;
		}
	}

}
