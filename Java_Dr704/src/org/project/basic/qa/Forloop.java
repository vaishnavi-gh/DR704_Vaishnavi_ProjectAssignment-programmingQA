package org.project.basic.qa;

public class Forloop {

	public static void main(String[] args) {

		System.out.println("start____");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// while loop

		System.out.println("while loop");
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			++a;
		}

		// do while

		System.out.println(" Do while ");

		int c = 1;

		do {
			System.out.println(c);

			++c;

		} while (c <= 10);
		
		// reverse do while 
		
		System.out.println(" reverse 10-->1");

		int d = 10;

		do {
			System.out.println(d);
			--d;
		} while (d >= 1);

		System.out.println("end____");

	}

}
