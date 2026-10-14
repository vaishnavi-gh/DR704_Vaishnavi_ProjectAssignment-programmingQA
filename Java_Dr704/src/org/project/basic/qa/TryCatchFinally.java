package org.project.basic.qa;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            
            System.out.println(10/0);
        }
       catch (ArithmeticException e) {
          System.out.println("Cannot divide by zero");
       }
        finally {
            System.out.println("inside finally block ");
        	
   
        
        }
    }
}