package org.asignment.qa;

public class fabonacci_series {

	public static void main(String[] args) {
		System.out.println("start _________");

		
		int a = 0;
		int b = 1;
		int count = 10;

		while (count > 0)

		{
			System.out.println(a + " ");
			

			int sum = a + b;
			a = b;
			b = sum;
			
			count--;
		}
		System.out.println("end_________");
		
	}
	
}
