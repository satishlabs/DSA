package com.satishlabs.bitwise;

//Check weather Kth bit of given number is Set or Not?
public class Lab11 {
	public static void main(String[] args) {
		int n=15;
		int k = 3;
		
		for(int i=1; i<=k-1; i++)
			n = n>>1; //Shifting One time
		if ((n & 1) != 0)
			System.out.println("Kth Bit is Set");
		else
			System.out.println("Kth Bit is Not Set");
	}
}
