package com.satishlabs.hashing3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Implement HashSet using Double Hashing

class MyHashSet {

	private int bukcetSize; // 7
	private int currentSize;
	private Integer[] mytable;

	public MyHashSet(int bukcetSize) {
		this.bukcetSize = bukcetSize;
		this.mytable = new Integer[bukcetSize];
		this.currentSize = 0;
	}

	public int size() {
		return this.currentSize;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public void clear() {
		this.currentSize = 0;
		for (int i = 0; i < bukcetSize; i++) {
			mytable[i] = null;
		}
	}

	public void add(Integer key) {
		int index = myHash1(key);
		if (mytable[index] != null) {
			index = myHash(key);
		}
		mytable[index] = key;
		this.currentSize++;
	}

	public void remove(Integer key) {
		int index = myHash1(key);
		if (mytable[index] != key) {
			index = myHash(key);
		}
		if (mytable[index] == key) {
			mytable[index] = null;
			this.currentSize--;
		}
	}

	public boolean contains(Integer key) {
		int index = myHash1(key);
		if (mytable[index] != key) {
			index = myHash(key);
		}

		return mytable[index] == key;
	}

	public int myHash1(Integer key) {
		int hash1 = key.hashCode() % this.bukcetSize;
		return hash1;
	}

	public int myHash2(Integer key) {
		int hash2 = (this.bukcetSize - 1) - key.hashCode() % (this.bukcetSize - 1);
		return hash2;
	}

	public int myHash(Integer key) {
		int hash1 = myHash1(key);
		int hash2 = myHash2(key);
		int myhash = 0;
		for (int i = 0; i < this.bukcetSize; i++) {
			myhash = (hash1 + i * hash2) % this.bukcetSize;
			if (mytable[myhash] == key) {
				return myhash;
			}
		}
		return myhash;
	}

	public String toString() {
		String str = "[ ";
		for (int i = 0; i < bukcetSize; i++) {
			if (mytable[i] != null) {
				str += mytable[i] + "\t";
			}
		}
		str = str + "]";
		return str;
	}

}

public class Lab5 {
	public static void main(String[] args) {
		MyHashSet myset = new MyHashSet(7);
		System.out.println("----------1----------");
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		myset.add(49);
		myset.add(63);
		myset.add(56);
		myset.add(52);
		myset.add(54);
		myset.add(48);

		System.out.println("----------2----------");
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		myset.remove(49);
		myset.remove(48);
		System.out.println("----------3----------");
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------4----------");
		System.out.println(myset.contains(49));
		System.out.println(myset.contains(52));

		System.out.println("----------5----------");
		myset.clear();
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

	}
}
