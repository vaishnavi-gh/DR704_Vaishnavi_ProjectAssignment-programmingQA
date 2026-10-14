package org.java_final_project.qa;

import java.util.Scanner;

public class Transaction1 {

	public static void main(String[] args) {

		System.out.println("Start-----");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Transaction ID:");
		int id = sc.nextInt();

		System.out.println("Enter Amount:");
		double amount = sc.nextDouble();

		if (amount > 50) {
			System.out.println(id + " : VALID");
		} else {
			System.out.println(id + " : INVALID");
		}

		sc.close();

		System.out.println("END -----");

	}

}
