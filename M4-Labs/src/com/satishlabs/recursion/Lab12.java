package com.satishlabs.recursion;

//Find the Palindrome with recursion
//n=5 => 0,1,1,2,3
//n=4 => 0,1,1,2
public class Lab12 {
	public static void main(String[] args) {
		int n=141;
		int p = checkPlaindrome(n,0);
		if(p ==n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

	private static int checkPlaindrome(int n,int temp) {
		//int temp=0;
		if(n==0)
			return temp;
		temp = (temp*10)+(n%10);
		return checkPlaindrome(n/10,temp);
	}
}

//Non-Tail Recursive
//Time Complexity : O(n)
//Aux Space Complexity : O(1)