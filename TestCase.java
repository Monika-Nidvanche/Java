package com.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	
	@Test
	public void array() {
		assertEquals(5,JunitExample.maximum(new int[]{1,2,3,4,5}));
		System.out.println("hi");
	}
	
	@Test
	public void add() {
		int result=2+3;
		assertEquals(5,result);
		System.out.println(result);
	}
	
	@Before
	public void message() {
		System.out.println("hello");
	}
	
	@BeforeClass
	public static void welcome() {
		System.out.println("welcome");
	}
	
	@After
	public void demo() {
		System.out.println("after method");
	}
	
	@AfterClass
	public static void get() {
		System.out.println("afterclass method");
	}

}
