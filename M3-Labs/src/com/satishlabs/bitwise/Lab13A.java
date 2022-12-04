package com.satishlabs.bitwise;

//Find Whether given Number is Power of 2 or Not
//Number of Set Bits are 1
public class Lab13A {
	public static void main(String[] args) {
		int n = 64;
		
		if ((n&(n-1)) == 0)
			System.out.println("2 Power");
		else
			System.out.println("Not 2 Power");
	}
}
