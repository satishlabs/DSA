package com.satishlabs.array;

//Insert new element in array at given position
//If capacity is not there in array, then Create a new Array and insert
public class Lab5 {
	public static void main(String[] args) {
		// int arr[] = {10,20,30,40,50};
		int arr[] = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int element = 99;
		int pos = 3;

		insert(arr, element, pos);

		System.out.println("-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int insert(int[] arr, int element, int pos) {
		int n = arr.length;
		int index = pos - 1;
		for (int i = n - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}

		arr[index] = element;

		return n + 1;
	}
}
