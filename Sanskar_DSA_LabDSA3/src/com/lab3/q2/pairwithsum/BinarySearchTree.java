package com.lab3.q2.pairwithsum;

import java.util.ArrayList;

class Node {

	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BinarySearchTree {

	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertNode(root, key);
	}

	Node insertNode(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insertNode(root.left, data);
		else if (data > root.data)
			root.right = insertNode(root.right, data);

		return root;
	}

	void inorder() {
		inorderTraversal(this.root);
	}

	void inorderTraversal(Node node) {
		if (node == null) {
			return;
		}

		inorderTraversal(node.left);
		System.out.print(node.data + " ");
		inorderTraversal(node.right);
	}

	void treeToList(Node node) {

		if (node == null)
			return;

		treeToList(node.left);
		list.add(node.data);
		treeToList(node.right);
	}

	ArrayList<Integer> list = new ArrayList<>();

	public void isPairPresent(Node node, int num) {

		treeToList(node);

		int start = 0, end = list.size() - 1;
		while (start < end) {
			if (list.get(start) + list.get(end) == num) {
				System.out.println("Pair Found: " + list.get(start) + " + " + list.get(end) + " = " + num);
				System.exit(0);
			}
			if (list.get(start) + list.get(end) > num) {
				end--;
			}
			if (list.get(start) + list.get(end) < num) {
				start++;
			}
		}
		System.out.println("No such pair of values are found.");
	}
}