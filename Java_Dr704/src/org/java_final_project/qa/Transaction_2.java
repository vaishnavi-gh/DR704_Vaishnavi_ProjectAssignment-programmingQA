package org.java_final_project.qa;

public class Transaction_2 {

	static String validateTransaction(double amount) { 
		
		if (amount > 50) {
			return "VALID";
		} else {
			return "INVALID";
		}
	}

	public static void main(String[] args) {

		System.out.println("Start-----");

		System.out.println(validateTransaction(1000));
		System.out.println(validateTransaction(-2500));
		System.out.println(validateTransaction(0));

		System.out.println("END -----");

	}

}
