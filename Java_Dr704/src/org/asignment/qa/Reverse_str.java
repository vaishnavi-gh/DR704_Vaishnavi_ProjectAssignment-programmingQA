package org.asignment.qa;

public class Reverse_str {
	
	public static void main(String[] args) {

        String str = "hello mini";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
            
        }

        System.out.println(rev);
    }

}
