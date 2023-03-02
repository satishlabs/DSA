package com.satishlabs.hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashSet {
	List<LinkedList<Integer>> mytable;
	int bukcet;

	public MyHashSet(int bukcet) {
		this.bukcet = bukcet;
		this.mytable = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<bukcet; i++) {
			mytable.add(new LinkedList<Integer>());
		}
	}

	public void insert(int key) {
		int index = key%bukcet;
		//mytable.get(index).add(key);
		
		//Not allow duplicates
		//if(!mytable.get(index).contains(key)) {
		if(!search(key)) {
			mytable.get(index).add(key);
		}
	}

	public void delete(int key) {
		int index = key%bukcet;
		mytable.get(index).remove((Integer)key);
	}

	public boolean search(int key) {
		int index = key%bukcet;
		return mytable.get(index).contains(key);
	}
	
	public String toString() {
		return mytable.toString();
	}
	
}

public class Lab2 {
	public static void main(String[] args) {
		MyHashSet myset = new MyHashSet(7);
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
		System.out.println(myset);
		
		myset.delete(23);
		myset.delete(25);
		myset.delete(50);
		System.out.println(myset);
		
		System.out.println(myset.search(50));
		System.out.println(myset.search(25));
		System.out.println(myset.search(49));
	}
}
