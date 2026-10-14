package org.java_final_project.qa;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		
		System.out.println("Start-----");


		ArrayList<String> names = new ArrayList<>();

		names.add("Neha");
		names.add("Sohan");
		names.add("Naina");
		names.add("Aditya");
		names.add("Payal");

		System.out.println(names);

		names.remove("Sohan");

		System.out.println(names);
		
		
		System.out.println("END -----");

	}

}
