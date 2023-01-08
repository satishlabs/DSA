package com.satishlabs.recursion;

//Find the fibonacci with recursion
//n=5 => 0,1,1,2,3
//n=4 => 0,1,1,2
public class Lab11 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++)
			System.out.print(fibo(i)+" ");
		//int f = fibo(n);
		
	}

	private static int fibo(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		else 
			return fibo(n-2)+fibo(n-1);
	}
}

//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)