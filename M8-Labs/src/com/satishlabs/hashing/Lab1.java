package com.satishlabs.hashing;

class MyTable {
	int mytable[];
	int capacity;

	public MyTable(int capacity) {
		this.capacity = capacity;
		mytable = new int[capacity];
	}

	public void insert(int key) {
		mytable[key]++;
	}

	public void delete(int key) {
		mytable[key]--;
	}

	public int search(int key) {
		return mytable[key];
	}

	public void show() {
		for (int i = 0; i < capacity; i++) {
			if (mytable[i] != 0) {
				System.out.println(i);
			}
		}
	}
}

public class Lab1 {
	public static void main(String[] args) {
		MyTable myTable = new MyTable(25);
		myTable.insert(5);
		myTable.insert(2);
		myTable.insert(7);
		myTable.insert(9);
		myTable.insert(0);
		
		myTable.show();
		
		myTable.delete(0);
		myTable.delete(2);
		System.out.println("----------After Deleting--------------");
		myTable.show();
		System.out.println("----------Search Operation--------------");
		
		System.out.println(myTable.search(0));
		System.out.println(myTable.search(7));
		System.out.println(myTable.search(9));
	}
}
