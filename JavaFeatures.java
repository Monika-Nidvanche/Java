package com.demo1;

import java.util.ArrayList;
import java.util.List;

public class JavaFeatures {
	
	public static void main(String args[]) {

//	Student s = (a,b)->(a*b);
//	//System.out.println(s.display(10, 20));
//	
//	int d=s.display(10, 20);
//	System.out.println(d);
	
	FunctionalI s = (name,rollno)->{System.out.println("name : "+name);
	System.out.println("roll no : "+rollno);
	};
	s.display("abc",20);
//	Student s = ()->{System.out.println("hello");};
//	s.display();
	
//	List l = new ArrayList();
//	l.add("student1");
//	l.add("student2");
//	
//	System.out.println(l);
//	
//	l.forEach((a)->{System.out.println(a);});
	
//	Student s1=()->{System.out.println(rollno+" "+name);};
//	s1.display();
	
	}

}
