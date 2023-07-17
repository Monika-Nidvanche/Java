package com.demo1;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a, b, c;
			a = 10;
			b = 0;
			c = a / b;

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("catch block");
		} finally {
			System.out.println("finlly block");
		}

	}

}
