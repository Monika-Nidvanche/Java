package com.demo1;

public class Student {
//	Create a class called Student with attributes name, rollNumber, and an array marks to store marks 
//	of multiple subjects. Implement methods to calculate the average
//	marks, display student details, and determine if the student has passed or failed
	public static void main(String[] args) {
		String name;
		int rollnumber;
		int sub1=70,sub2=75,sub3=80,sub4=85;
		int marks[]= {sub1,sub2,sub3,sub4};
		Student s = new Student();
		int averageMarks= s.average(sub1, sub2, sub3, sub4);
		System.out.println("Average Marks : "+averageMarks);
		if(averageMarks>40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}
	public int average(int a, int b, int c, int d) {
		int sum=(a+b+c+d)/4;
		return sum;
	}

}
