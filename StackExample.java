package com.demo1;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> strings = new Stack<String>();

		strings.push("Linux");

		strings.push("Windows");

		strings.push("Mac");

		strings.pop();

		System.out.println("Elements in stack: " + strings);

	}

}
