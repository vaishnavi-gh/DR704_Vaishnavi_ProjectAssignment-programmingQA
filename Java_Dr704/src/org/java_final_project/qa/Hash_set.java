package org.java_final_project.qa;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		
		System.out.println("Start-----");


		HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Nashik");
        cities.add("Surat");

        System.out.println(cities);

        cities.add("Mumbai");

        System.out.println(cities);		
		System.out.println("END -----");

	}

}
