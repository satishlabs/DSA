package com.satishlabs.recursion;

//Find the Sum of Numbers from 1 to N/N to 1
public class Lab8 {
	public static void main(String[] args) {
		int n=5;
		int sum = sum(n);
		System.out.println(sum);
	}

	private static int sum(int n) {
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
}

//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)
