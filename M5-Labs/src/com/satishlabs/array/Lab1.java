package com.satishlabs.array;

public class Lab1 {
	public static void main(String[] args) {
		//1. Create a array
		int arr[] = new int[5];
		
		//2. find the length of Array
		int n = arr.length;
		System.out.println(n);
		
		//3. Access Elements of Array
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
		
		//4. Intilizing the elements
		arr[0]=11;
		arr[1]=22;
		arr[4]=44;
		System.out.println("---------------");
		
		//5. Access Elements of Array
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
				
		
	}
}
