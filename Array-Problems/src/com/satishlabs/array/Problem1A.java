package com.satishlabs.array;

//Reverse the given array

public class Problem1A {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		reverse(arr);
		System.out.println();
		System.out.println("---------------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverse(int[] arr) {
		int n = arr.length;
	
		for(int i=0,j=n-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	}
}
