package com.i2017.dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinarySearchTree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(T t) {
		if (root == null)
			root = new TreeNode<>(t);
		else
			insert(root, t);
	}

	private void insert(TreeNode<T> n, T t) {
		if (t.compareTo(n.getValue()) > 0) {
			if (n.getRight() == null) {
				n.setRight(new TreeNode<T>(t));
			} else {
				insert(n.getRight(), t);
			}
		} else {
			if (n.getLeft() == null) {
				n.setLeft(new TreeNode<T>(t));
			} else {
				insert(n.getLeft(), t);
			}
		}
	}

	public void bfs() {
		Deque<TreeNode<T>> queue = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		if (root == null) {
			System.out.println("BFS: []");
			return;
		}

		queue.addLast(root);

		sb.append("BFS: [");
		while (!queue.isEmpty()) {
			TreeNode<T> tmp = queue.removeFirst();
			sb.append(tmp.getValue());
			if (tmp.getLeft() != null) {
				queue.addLast(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				queue.addLast(tmp.getRight());
			}
			if (!queue.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append("]");

		System.out.println(sb);
	}

	public void dfs() {
		if (root == null) {
			System.out.println("DFS: []");
			return;
		}

		Deque<TreeNode<T>> stack = new ArrayDeque<>();
		stack.addLast(root);
		StringBuilder sb = new StringBuilder();
		sb.append("DFS: [");
		while (!stack.isEmpty()) {
			TreeNode<T> tmp = stack.removeLast();
			sb.append(tmp.getValue());
			if (tmp.getRight() != null) {
				stack.addLast(tmp.getRight());
			}
			if (tmp.getLeft() != null) {
				stack.addLast(tmp.getLeft());
			}
			if (!stack.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append("]");

		System.out.println(sb);
	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(9);
		tree.add(4);
		tree.add(13);
		tree.add(19);
		tree.add(6);
		tree.add(1);
		tree.add(5);
		tree.add(7);
		tree.add(10);

		tree.bfs();
		System.out.println();
		tree.dfs();
	}
}