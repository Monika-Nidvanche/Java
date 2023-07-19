package com.demo1;

public class JunitExample {

	public static int maximum(int arr[]) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];
			}
		}
		System.out.println(a);
		return a;
	}

}
