package com.demo1;

public class MethodRefer {
	
//	MethodRefer(String message){
//		System.out.println(message);
//	}
	
//	public static String name="abc";
//	
//	public void hello(String name) {
//		//this.name=name;
//		System.out.println("welcome");
//		System.out.println(name);
//	}

	
//	public static void hello(String name) {
//		System.out.println("welcome");
//		System.out.println(name);
//	}
	
	public static void hello() {
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		
//		StudentInterface student = MethodRefer::new;
//		student.msg("abc");
		
//		StudentInterface student =new MethodRefer()::hello;
//		student.display("abc");
		
//		StudentInterface student = MethodRefer::hello;
//		student.display("abc");
		
		StudentInterface student = MethodRefer::hello;
		student.display();
	}

}
