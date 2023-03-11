package com.satishlabs.hashing6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Implement HashMap using chaining to Store Integers
//Leetcode: 706. Design HashMap

class MyEntry<K, V> {
	public Integer key;
	public Integer value;

	public MyEntry(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String toString() {
		return "{ " + key + " : " + value + " }";
	}
}

class MyHashMap {

	private int bukcetSize; // 7
	private int currentSize;
	List<LinkedList<MyEntry<Integer, Integer>>> mytable;

	public MyHashMap(int bukcetSize) {
		this.bukcetSize = bukcetSize;
		this.mytable = new ArrayList<LinkedList<MyEntry<Integer, Integer>>>();
		for (int i = 0; i < bukcetSize; i++) {
			mytable.add(new LinkedList<MyEntry<Integer, Integer>>());
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
			mytable.add(new LinkedList<MyEntry<Integer, Integer>>());
		}
		this.currentSize = 0;
	}

	public Integer get(Integer mykey) {// 50
		int index = myHash(mykey);// index=1
		LinkedList<MyEntry<Integer, Integer>> mylinkedlist = mytable.get(index);
		for (MyEntry<Integer, Integer> myentry : mylinkedlist) {
			if (myentry.key.equals(mykey)) {
				return myentry.value;
			}
		}
		return -1;
	}

	public void put(Integer mykey, Integer myvalue) {
		int index = myHash(mykey);
		LinkedList<MyEntry<Integer, Integer>> mylinkedList = mytable.get(index);
		boolean found = false;
		for (MyEntry<Integer, Integer> myentry : mylinkedList) {
			if (myentry.key.equals(mykey)) {
				myentry.value = myvalue;
				found = true;
			}
		}
		if (!found) {
			mylinkedList.add(new MyEntry<Integer, Integer>(mykey, myvalue));
			currentSize++;
		}

	}

	public void remove(Integer mykey) {
		int index = myHash(mykey);
		LinkedList<MyEntry<Integer, Integer>> mylinkedList = mytable.get(index);
		for (MyEntry<Integer, Integer> myentry : mylinkedList) {
			if (myentry.key.equals(mykey)) {
				mylinkedList.remove(myentry);
				currentSize--;
				break;
			}
		}
	}

	public int myHash(Integer key) {
		int hash = key % this.bukcetSize;
		return hash;
	}

	public String toString() {
		return mytable.toString();
	}

}

public class Lab6 {
	public static void main(String[] args) {
		MyHashMap myhmap = new MyHashMap(7);
		System.out.println("----------1----------");
		System.out.println(myhmap.size());
		System.out.println(myhmap.isEmpty());
		System.out.println(myhmap);

		System.out.println("----------2----------");
		myhmap.put(50, 5050);
		myhmap.put(21, 2121);
		myhmap.put(58, 5858);
		myhmap.put(17, 1717);
		myhmap.put(15, 1515);
		myhmap.put(49, 4949);
		myhmap.put(56, 5656);
		myhmap.put(22, 2222);
		myhmap.put(23, 2323);
		myhmap.put(25, 2525);
		myhmap.put(23, 8888);
		myhmap.put(25, 9999);

		System.out.println(myhmap.size());
		System.out.println(myhmap.isEmpty());
		System.out.println(myhmap);

		System.out.println("----------3----------");
		myhmap.remove(23);
		myhmap.remove(25);
		myhmap.remove(50);

		System.out.println(myhmap.size());
		System.out.println(myhmap.isEmpty());
		System.out.println(myhmap);

		System.out.println("----------4----------");

		System.out.println(myhmap.get(50));
		System.out.println(myhmap.get(25));
		System.out.println(myhmap.get(49));

		System.out.println("----------5----------");
		myhmap.clear();

		System.out.println(myhmap.size());
		System.out.println(myhmap.isEmpty());
		System.out.println(myhmap);
	}
}
