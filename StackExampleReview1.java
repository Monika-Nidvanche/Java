package com.demo1;

import java.util.Scanner;
import java.util.Stack;

public class StackExampleReview1 {
//	Java code for stack implementation
//	1) // Pushing element on the top of the stack
//	2) // Popping element from the top of the stack
//	3) // Displaying element on the top of the stack
//	4)  // Searching element in the stack
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Push " + s);
		s.pop();
		System.out.println("Pop " + s);
		System.out.println("Peek " + s.peek());
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search : ");
		int b = sc.nextInt();
		if (s.contains(b)) {
			System.out.println(b);
		} else {
			System.out.println("No element");
		}

	}

}
