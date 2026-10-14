package org.project.basic.qa;

public class array {
	
	public static void main(String[] args) {
		// array 
		int arr[]= new int [2];
		
		
		arr[0]= 100;
		arr[1]=200;
	
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		// using loop 
		
		System.out.println(" array using loop  ");
		
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr [i]);
		}
		
		
		
		System.out.println(" array reverse ");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr [i]);
		}
		
		
		// using for each 
		
		System.out.println(" using  for each loop  ");
		
		
		for(int array :arr) {
			System.out.println(array);
		
		}
	}

}
