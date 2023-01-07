package com.satishlabs.recursion;

public class Lab4 {
	public static void main(String[] args) {
		show(5);
	}

	private static void show(int n) {
		if(n==0)
			return;
		show(n-1);
		System.out.println("Hai Guys");
		
	}
}
