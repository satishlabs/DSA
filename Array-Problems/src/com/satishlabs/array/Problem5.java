package com.satishlabs.array;

//Rotate the Elements Left Side 1 time

public class Problem5 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		leftRotateOne(arr);
		System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void leftRotateOne(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}

}
