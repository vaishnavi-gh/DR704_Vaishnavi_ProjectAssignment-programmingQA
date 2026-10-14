package org.java_final_project.qa;

public class Array_2 {
	public static void main(String[] args) {
		
		 System.out.println("START-----");

		int a[] = { 10, 50, 30, 20, 40 };
		int max = a[0];

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);

			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Largest number: " + max);
		
		 System.out.println("END-----");
	}
}
