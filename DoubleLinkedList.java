package com.demo1;

public class DoubleLinkedList {

	class Node {
		int data;
		Node pre;
		Node next;

		public Node(int data) {
			this.data = data;

		}
	}

	Node head, tail = null;

	public void add(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = tail = node;
			head.pre = null;
			tail.next = null;

		} else {
			tail.next = node;
			node.pre = tail;
			tail = node;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String args[]) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(1);
		doubleLinkedList.add(12);
		doubleLinkedList.display();
	}
}
