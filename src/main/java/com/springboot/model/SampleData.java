package com.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

	public List<Student> buildStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("12345", "john", "wayne", "12", buildAddress(), Major.BIOLOGY));
		students.add(new Student("12346", "jack", "ryan", "13", buildAddress(), Major.CHEMISTRY));
		students.add(new Student("12347", "sam", "wilson", "14", buildAddress(), Major.PHYSICS));
		students.add(new Student("12348", "peter", "parker", "15", buildAddress(), Major.MATHS));
		students.add(new Student("12349", "steve", "rogers", "17", buildAddress(), Major.PHYSICS));
		students.add(new Student("12350", "mark", "meyers", "12", buildAddress(), Major.BIOLOGY));
		students.add(new Student("12351", "mary", "jane", "16", buildAddress(), Major.CHEMISTRY));
		return students;
	}

	public Address buildAddress() {
		return new Address("100", "bay street", "Los Angeles", "California", "90123");
	}
}
