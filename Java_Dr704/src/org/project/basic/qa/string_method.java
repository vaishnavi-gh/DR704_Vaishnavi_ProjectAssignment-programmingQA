package org.project.basic.qa;

public class string_method {
	
	
	public static void main(String[] args) {
	
		String s1 = "abc";
		int a =222 ;
		
		System.out.println(s1);
		
		System.out.println(s1.indexOf("a"));// return index value  at character
		System.out.println(s1.charAt(2)); // character at 2nd index
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1+ a);
		// LONG TO STRING
		
		long b= 456123;
		String strB =String.valueOf(b);
		System.out.println(strB.length());
		// STRING TO INT
		
		String s5 = "123456";
		System.out.println(s5+1);
		Integer c= Integer.valueOf(s5);
		System.out.println(c+1);
		
		
		
		
		

	}
	
}
