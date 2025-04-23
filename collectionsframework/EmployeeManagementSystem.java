package com.vardhan.collectionsframework;

import java.util.*;

class Employee {
	int id;
	String name;
	String department;
	double salary;

	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String toString() {
		return id + " - " + name + " - " + department + " - $" + salary;
	}
}

class SalaryComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.salary, e2.salary);
	}
}

class NameComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Alice", "HR", 55000));
		employeeList.add(new Employee(102, "Bob", "IT", 65000));
		employeeList.add(new Employee(103, "Charlie", "Finance", 60000));
		employeeList.add(new Employee(104, "David", "IT", 70000));
		employeeList.add(new Employee(105, "Eva", "HR", 58000));

		System.out.println("All Employees:");
		employeeList.forEach(System.out::println);

		Set<String> departments = new HashSet<>();
		for (Employee e : employeeList) {
			departments.add(e.department);
		}

		System.out.println("\nDepartments:");
		departments.forEach(System.out::println);

		Map<String, List<Employee>> deptMap = new HashMap<>();
		for (Employee e : employeeList) {
			if (!deptMap.containsKey(e.department)) {
			    deptMap.put(e.department, new ArrayList<>());
			}
			deptMap.get(e.department).add(e);

		}

		System.out.println("\nEmployees by Department:");
		for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
			System.out.println(entry.getKey() + ":");
			entry.getValue().forEach(emp -> System.out.println("  " + emp));
		}

		Collections.sort(employeeList, new SalaryComparator());
		System.out.println("\nEmployees Sorted by Salary:");
		employeeList.forEach(System.out::println);

		Collections.sort(employeeList, new NameComparator());
		System.out.println("\nEmployees Sorted by Name:");
		employeeList.forEach(System.out::println);
	}
}
