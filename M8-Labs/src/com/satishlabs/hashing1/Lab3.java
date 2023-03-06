package com.satishlabs.hashing1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Implement HashSet using chaining

class MyHashSet {

	private int bukcetSize; // 7
	private int currentSize;
	List<LinkedList<Integer>> mytable;

	public MyHashSet(int bukcetSize) {
		this.bukcetSize = bukcetSize;
		this.mytable = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < bukcetSize; i++) {
			mytable.add(new LinkedList<Integer>());
		}
	}

	public int size() {
		return this.currentSize;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public void clear() {
		this.mytable.clear();
		for (int i = 0; i < bukcetSize; i++) {
			mytable.add(new LinkedList<Integer>());
		}
		this.currentSize = 0;
	}

	public void insert(Integer key) {
		int index = myHash(key);
		// mytable.get(index).add(key);

		// Not allow duplicates
		// if(!mytable.get(index).contains(key)) {
		if (!search(key)) {
			mytable.get(index).add(key);
			currentSize++;
		}
	}

	public void delete(Integer key) {
		int index = myHash(key);
		mytable.get(index).remove((Integer) key);
		currentSize--;
	}

	public boolean search(Integer key) {
		int index = myHash(key);
		return mytable.get(index).contains(key);
	}

	public int myHash(Integer key) {
		int hash = key % this.bukcetSize;
		return hash;
	}

	public String toString() {
		return mytable.toString();
	}

}

public class Lab3 {
	public static void main(String[] args) {
		MyHashSet myset = new MyHashSet(7);
		System.out.println("----------1----------");
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------2----------");
		myset.insert(50);
		myset.insert(21);
		myset.insert(58);
		myset.insert(17);
		myset.insert(15);
		myset.insert(49);
		myset.insert(56);
		myset.insert(22);
		myset.insert(23);
		myset.insert(25);
		myset.insert(23);
		myset.insert(25);

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------3----------");
		myset.delete(23);
		myset.delete(25);
		myset.delete(50);

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------4----------");

		System.out.println(myset.search(50));
		System.out.println(myset.search(25));
		System.out.println(myset.search(49));

		System.out.println("----------5----------");
		myset.clear();

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);
	}
}
