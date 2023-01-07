package com.satishlabs.recursion;

public class Lab1 {
	
	public static void m2() {
		System.out.println("I am m2");
	}
	
	public static void m1() {
		System.out.println("m1 - begin");
		m2();
		System.out.println("m1 - end");
	}
	public static void main(String[] args) {
		System.out.println("Main - begin");
		m1();
		System.out.println("Main - end");
	}
}
