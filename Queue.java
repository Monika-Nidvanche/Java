package com.demo1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("employee1");
		queue.add("employee2");
		queue.add("employee3");

		System.out.println("head " + queue.element());

		System.out.println("all element " + queue.peek());

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("all elements are removed");
		queue.remove();
		// queue.removeAll();
		System.out.println(queue);

//		Iterator<String> iterator1 = queue.iterator();
//		while (iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}
//		System.out.println("hi");
	}

}
