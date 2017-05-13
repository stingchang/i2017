package com.i2017.algorithm;

public class ListNode {
	private int value;
	private ListNode next;
	
	public ListNode(int value){
		this.value = value;
		setNext(null);
	}
	
	public void setValue(int value){
		this.value =  value;
	}
	
	public void setNext(ListNode next){
		this.next = next;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public ListNode getNext(){
		return this.next;
	}
}
