package com.i2017.dataStructure;

public class LinkedList {
	private ListNode head, tail;

	public LinkedList() {
		head = tail = null;
	}

	public void add(int value) {
		if (head == null) {
			head = tail = new ListNode(value);
		} else {
			tail.setNext(new ListNode(value));
			tail = tail.getNext();
		}
	}

	public void delete() {
		if (head == null)
			return;

		if (head == tail) {
			head = tail = null;
			return;
		}

		ListNode tmp = head;
		while (tmp.getNext() != tail)
			tmp = tmp.getNext();

		tail = tmp;
		tail.setNext(null);
	}

	public int size() {
		if (head == null)
			return 0;

		int index = 1;
		ListNode tmp = head;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
			index++;
		}

		return index;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');

		ListNode tmp = head;
		while (tmp != null) {
			sb.append(tmp.getValue());
			tmp = tmp.getNext();

			if (tmp != null) {
				sb.append(", ");
			}
		}
		sb.append(']');

		return sb.toString();
	}
}
