package com.vardhan.collectionsframework;

import java.util.*;

class Student {
	String name;
	int id;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " - " + name;
	}
}

public class CourseEnrollment {
	public static void main(String[] args) {
		LinkedList<Student> enrolledStudents = new LinkedList<>();

		// Adding students
		enrolledStudents.add(new Student(101, "Alice"));
		enrolledStudents.add(new Student(102, "Bob"));
		enrolledStudents.add(new Student(103, "Charlie"));
		enrolledStudents.add(new Student(104, "Diana"));

		// Display using Iterator (Forward)
		System.out.println(" Enrolled Students (Forward):");
		Iterator<Student> itr = enrolledStudents.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Modify using ListIterator (Forward + Backward)
		System.out.println("\n Modifying List using ListIterator:");
		ListIterator<Student> listItr = enrolledStudents.listIterator();

		while (listItr.hasNext()) {
			Student s = listItr.next();
			if (s.name.equals("Charlie")) {
				listItr.set(new Student(s.id, "Charles")); // rename Charlie
			}
		}

		// Reverse Traversal
		System.out.println("\n Enrolled Students (Backward):");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}
}
