package com.satishlabs.hashing4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Implement HashSet using chaining

class MyHashSet {

	private int bukcetSize; // 7
	private int currentSize;
	List<LinkedList<String>> mytable;

	public MyHashSet(int bukcetSize) {
		this.bukcetSize = bukcetSize;
		this.mytable = new ArrayList<LinkedList<String>>();
		for (int i = 0; i < bukcetSize; i++) {
			mytable.add(new LinkedList<String>());
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
			mytable.add(new LinkedList<String>());
		}
		this.currentSize = 0;
	}

	public void insert(String key) {
		int index = myHash(key);
		if (!search(key)) {
			mytable.get(index).add(key);
			currentSize++;
		}
	}

	public void delete(String key) {
		int index = myHash(key);
		mytable.get(index).remove((String) key);
		currentSize--;
	}

	public boolean search(String key) {
		int index = myHash(key);
		return mytable.get(index).contains(key);
	}

	public int myHash(String key) {
		int hash = key.hashCode() % this.bukcetSize;
		return hash;
	}

	public String toString() {
		return mytable.toString();
	}

}

public class Lab4 {
	public static void main(String[] args) {
		MyHashSet myset = new MyHashSet(7);
		System.out.println("----------1----------");
		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------2----------");
		myset.insert("aa");
		myset.insert("bb");
		myset.insert("cc");
		myset.insert("dd");
		myset.insert("ee");
		myset.insert("ab");
		myset.insert("bc");
		myset.insert("cd");
		myset.insert("de");
		myset.insert("ef");
	

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------3----------");
		myset.delete("ab");
		myset.delete("de");
		myset.delete("dd");

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);

		System.out.println("----------4----------");

		System.out.println(myset.search("aa"));
		System.out.println(myset.search("dd"));
		System.out.println(myset.search("ef"));

		System.out.println("----------5----------");
		myset.clear();

		System.out.println(myset.size());
		System.out.println(myset.isEmpty());
		System.out.println(myset);
	}
}
