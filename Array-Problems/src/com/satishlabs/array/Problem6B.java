package com.satishlabs.array;

//Rotate the Elements Left Side k times

public class Problem6B {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		leftRotate(arr, k);
		System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void leftRotate(int[] arr, int k) {
		int n = arr.length;
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
