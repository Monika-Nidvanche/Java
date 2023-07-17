package com.demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {

		List<EmployeeForm> l = new ArrayList<>();

		l.add(new EmployeeForm(101, "employee1", 10000, "Mumbai"));
		l.add(new EmployeeForm(103, "employee2", 20000, "Pune"));
		l.add(new EmployeeForm(102, "employee3", 50000, "Mumbai"));
		l.add(new EmployeeForm(104, "employee4", 40000, "Hydrabad"));

		Map<Integer, String> map = l.stream().filter(a -> (a.city == "Mumbai"))
				.collect(Collectors.toMap(a -> a.id, a -> a.name));
		System.out.println("map : " + map + "\n");

		List<EmployeeForm> l4 = l.stream().sorted(Comparator.comparingInt(a -> a.id)).collect(Collectors.toList());

		System.out.println("Id (sotred) : ");
		l4.forEach(a -> System.out.println(a));
		System.out.println();

		List<EmployeeForm> l5 = l.stream().filter(a -> a.city.equals("Mumbai")).collect(Collectors.toList());
		System.out.println("city (filter) : ");
		l5.forEach(a -> System.out.println(a));
		System.out.println();

		long stream4 = l.stream().count();
		System.out.println("employee (count) : " + stream4);

	}

}
