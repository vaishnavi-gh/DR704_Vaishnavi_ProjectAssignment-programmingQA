package org.java_final_project.qa;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		
		System.out.println("Start-----");
		
		  HashMap<Integer, String> students = new HashMap<>();

	        students.put(101, "Rahul");
	        students.put(102, "Priya");
	        students.put(103, "Amit");
	        students.put(104, "Neha");
	        students.put(105, "Sneha");

	        System.out.println(students);

	        System.out.println("Student Name: " + students.get(103));
		System.out.println("END -----");

	}

}
