package com.satishlabs.recursion;

//Print Numbers from 1 to N

/*
Non-Tail Recursive: 
	- When the recursive Call is not the Last Statement then it is Called as Non-Tail Recursive
	- You have something to do after the Recursive Call

1. Base Case
2. Recursive Call
3. Subtask Logic
* */
public class Lab7 {
	public static void main(String[] args) {
		int n=5;
		printNumbers(n);
	}

	private static void printNumbers(int n) {
		if(n==0)//Base Case
			return;
		
		printNumbers(n-1); //Recursive Call
		
		System.out.println(n); //Subtask Logic
	}
}
