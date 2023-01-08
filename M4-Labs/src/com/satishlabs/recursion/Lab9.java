package com.satishlabs.recursion;

//Find the factorial of given number
public class Lab9 {
	public static void main(String[] args) {
		int n=5;
		int f = fact(n);
		System.out.println(f);
	}

	private static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
}

//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)