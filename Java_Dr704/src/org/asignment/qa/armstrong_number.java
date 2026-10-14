package org.asignment.qa;

public class armstrong_number {
	
	public static void main(String[] args) {

        int num = 151;
        int sum = 1*1*1 + 5*5*5 + 1*1*1;

        if (sum == num)
            System.out.println(num+ "  Is armstrong Number");
        else
            System.out.println(num+  "  Is not Armstrong Number");
    }

}
