package com.i2017.algorithm;

public class Test {
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		System.out.println(list);
		list.add(1);
		System.out.println(list);
		list.add(2);
		System.out.println(list);
		list.add(2);
		list.add(3);
		list.add(2);
		System.out.println(list);
		list.delete();
		System.out.println(list);
	}
}
