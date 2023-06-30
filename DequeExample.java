package com.demo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();

//		deque.add("student1");
//		deque.add("student2");
//		deque.add("student3");

		deque.offerFirst("student1");
		deque.offer("student2");
		deque.offerLast("student3");
		deque.offer("student4");

		deque.poll();
		deque.push("student5");
//		deque.pollFirst();
//		deque.pollLast();

		for (String dq : deque) {
			System.out.println(dq);
		}

	}

}
