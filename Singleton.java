package com.demo1;

public class Singleton {

	private Singleton() {

	}

	private static Singleton instance;

	public static Singleton getSingletonInstance() {
		if (instance == null) {
			instance = new Singleton();
		} else {
			return instance;
		}
		return instance;

	}

	public static void main(String[] args) {

		Singleton instance1 = Singleton.getSingletonInstance();
		Singleton instance2 = Singleton.getSingletonInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
