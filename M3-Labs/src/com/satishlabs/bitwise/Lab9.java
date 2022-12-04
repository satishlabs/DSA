package com.satishlabs.bitwise;

//Check weather Last bit of given number is Set or Not
public class Lab9 {
	public static void main(String[] args) {
		int n = 4;
		if ((n & 1) != 0)
			System.out.println("Last bit is to set");
		else
			System.out.println("Last bit is not set");
	}
}
