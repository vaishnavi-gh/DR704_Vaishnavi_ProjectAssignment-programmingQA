package org.project.basic.qa;

public class Array_method {

	public static void main(String[] args) {

		System.out.println("start-----------");

		int[] numbers = { 10, 25, 8, 43, 16, 7, 30 };

		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];

		System.out.println("Even numbers:");

		for (int num : numbers) {

			if (num % 2 == 0) {
				System.out.println(num);
			}

			sum = sum + num;

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		System.out.println("Sum of all elements: " + sum);
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);

		System.out.println("end-----------");
	}

}
