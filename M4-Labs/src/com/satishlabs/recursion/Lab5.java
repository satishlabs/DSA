package com.satishlabs.recursion;

public class Lab5 {
	public static void main(String[] args) {
		show(5);
	}

	private static void show(int n) {
		System.out.println("Welcome To SatishLabs"); //Logic
		
		if(n==0)  //Base Case
			return;
		
		show(n-1); //Recursive call
		
		
	}
}
