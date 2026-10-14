package org.asignment.qa;

public class swaping {

	public static void main(String[] args) {

		System.out.println("START_______________________");

		int a = 800;
		int b = 209;
		int c;
		int p = 10;
		int q = 20;

		System.out.println("Using third variable");

		System.out.println("Before");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("END_______________________");
		System.out.println("\nSTART_______________________");

		System.out.println("Without 3rd variable");

		System.out.println("Before");
		System.out.println("p = " + p);
		System.out.println("q = " + q);

		p = p + q;  // p=30
		q = p - q;//q=10
		p = p - q;//p=20

		System.out.println("After Swapping:");
		System.out.println("p = " + p);
		System.out.println("q = " + q);

		System.out.println("END_______________________");
	}
}