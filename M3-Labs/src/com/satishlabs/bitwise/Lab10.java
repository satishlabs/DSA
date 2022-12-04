package com.satishlabs.bitwise;

//Check weather given number is Odd or Even
//If Last bit is Set then It is Odd
//If Ladt bit is Un-Set then It  is EVEN
public class Lab10 {
	public static void main(String[] args) {
		int n = 5;
		if ((n & 1) != 0)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}
}
