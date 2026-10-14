package org.asignment.qa;

public class primenumber {
	
	public static void main(String[] args) {
		System.out.println("start-----------");

        int num = 5;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num+ "is a Prime Number");
        } else {
            System.out.println(num+"is Not a Prime Number");
        }
        
        
        System.out.println("end-----------");

	}
	
}
