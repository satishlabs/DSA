package com.satishlabs.recursion;

//Find the sum of Individual Digits of given number
//n=135 => 1+3+5 =>9
public class Lab10 {
	public static void main(String[] args) {
		int n=135;
		int sum = digitSum(n);
		System.out.println(sum);
	}

	private static int digitSum(int n) {
		if(n==0)
			return 0;
		else 
			return n%10+digitSum(n/10);
	}
}

//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)