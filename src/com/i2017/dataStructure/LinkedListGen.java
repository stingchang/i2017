package com.i2017.dataStructure;

public class LinkedListGen<T> {
	
	private Node<T> head;
	
	public LinkedListGen() {
		head = null;
	} 
	
	public void add(T t) {
		if(head == null)
			head = new Node<T>(t);
		else {
			Node<T> tmp = head;
			while(tmp.getNext() != null){
				tmp = tmp.getNext();
			}
			tmp.setNext(new Node<T>(t));
		}
	}
	
	public void delete() {
		if(head == null)
			return;
		
		if(head.getNext() == null){
			head = null;
			return;
		}
		
		Node<T> tmp = head;
		while(tmp.getNext().getNext() != null) 
			tmp = tmp.getNext();
		
		tmp.setNext(null);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		Node<T> tmp = head;
		while(tmp!=null){
			sb.append(tmp.getValue());
			if(tmp.getNext()!=null){
				sb.append(", ");
			}
			
			tmp = tmp.getNext();
		}
		
		sb.append(']');
		return sb.toString();
	}
	
	public static void main(String args[]) {
		LinkedListGen<Integer> list = new LinkedListGen<>();
		System.out.println(list);
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		list.delete();
		System.out.println(list);
		list.delete();
		System.out.println(list);
		
		System.out.println();
		LinkedListGen<String> list2 = new LinkedListGen<>();
		System.out.println(list2);
		list2.add("a");
		list2.add("b");
		System.out.println(list2);
		list2.add("c");
		list2.add("d");
		System.out.println(list2);
		list2.delete();
		System.out.println(list2);
	}
}

class Node<T> {
	private Node<T> next;
	private T value;
	
	public Node(T t) {
		value = t;
		next = null;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setValue(T v){
		this.value = v;
	}
	
	public T getValue(){
		return this.value;
	}
}