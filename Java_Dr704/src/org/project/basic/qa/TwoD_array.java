package org.project.basic.qa;

public class TwoD_array {
	
	public static void main(String[] args){
		
		int arr[][]=new int [2][2];
		arr[0][0]=100;
		arr[0][1]=200;
		arr[1][0]=300;
		arr[1][1]=400;
		
		
	System.out.println("Print d irectly ");
	System.out.println(arr[0][0]);

	System.out.println(" PRINT WITH LOOP");
	
	for (int i=0;i<arr.length;i++)
	{
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[i][j]);
		}
	}
		
		
		
	}

}
