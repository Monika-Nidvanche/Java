package com.demo1;

public class BinaryTree {

	public static class Node {
		int key;
		Node right, left;

		public Node(int item) {
			key = item;
			left = right = null;

		}
	}

	Node root;

	public void traveling(Node node) {
		if (node != null) {
			traveling(node.left);

			System.out.println("" + node.key);
			traveling(node.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(12);
		binaryTree.root.left = new Node(10);
		binaryTree.traveling(binaryTree.root);
	}

}
