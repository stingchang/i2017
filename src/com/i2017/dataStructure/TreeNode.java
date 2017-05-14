package com.i2017.dataStructure;

public class TreeNode<T extends Comparable<T>> {
	private TreeNode<T> left;
	private TreeNode<T> right;
	private T value;

	public TreeNode(T value) {
		left = right = null;
		this.value = value;
	}

	public void setLeft(TreeNode<T> n) {
		this.left = n;
	}

	public void setRight(TreeNode<T> n) {
		this.right = n;
	}

	public TreeNode<T> getLeft() {
		return this.left;
	}

	public TreeNode<T> getRight() {
		return this.right;
	}

	public void setValue(T t) {
		this.value = t;
	}

	public T getValue() {
		return this.value;
	}
}
