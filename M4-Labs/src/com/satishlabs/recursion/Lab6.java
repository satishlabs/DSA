package com.satishlabs.recursion;

//Print Numbers from N to 1
/*
 Tail Recursive: 
 	- When the recursive Call is the Last Statement then it is Called as Tail Recursive
 	- Nothing to do after the Recursive Call
 
 1. Base Case
 2. SubTask Logic
 3. Recursive Call
 * */
public class Lab6 {
	public static void main(String[] args) {
		int n=5;
		printNumbers(n);
	}

	private static void printNumbers(int n) {
		if(n==0) //Base Case
			return;
		
		System.out.println(n); //Subtask Logic
		
		printNumbers(n-1);  //Recursive Call
		
	}
}
