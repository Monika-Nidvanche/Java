package com.demo1;

public class EmployeeForm {
// Stream Example
	int id;
	String name;
	int salary;
	String city;

	public EmployeeForm(int id, String name, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	

}
