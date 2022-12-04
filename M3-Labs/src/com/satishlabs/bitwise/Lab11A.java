package com.satishlabs.bitwise;

//Check weather Kth bit of given number is Set or Not?
public class Lab11A {
	public static void main(String[] args) {
		int n=15;
		int k = 5;
		
		
			n = n>>k-1; //Shifting One time
		if ((n & 1) != 0)
			System.out.println("Kth Bit is Set");
		else
			System.out.println("Kth Bit is Not Set");
	}
}
