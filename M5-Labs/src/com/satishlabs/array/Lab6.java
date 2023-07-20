package com.satishlabs.array;

//Delete a given element in array

public class Lab6 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int element = 30;

		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		deleteElement(arr, element);

		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void deleteElement(int[] arr, int element) {
		int n = arr.length;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}

		}
		for (int i = index; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[n - 1] = 0;

	}
}
