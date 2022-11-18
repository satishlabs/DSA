package com.satishlabs.numbersandloops;

//28) WAP to find whether given number is Palindrome or not. 

public class Lab28 {
	public static void main(String[] args) {
		int num=121;
		int rev=0;
		int numCopy=num;
		while(num!=0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10; //changing the number
		}
		if(numCopy == rev)
			System.out.println(numCopy+" is Palindrome");
		else
			System.out.println(numCopy+" is Not Palindrome");
	}

}
