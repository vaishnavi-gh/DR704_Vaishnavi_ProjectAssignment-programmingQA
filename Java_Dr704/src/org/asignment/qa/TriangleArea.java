package org.asignment.qa;

public class TriangleArea {

 
    static double calculateArea(double base, double height) {              //method created in class to calculate area of triangle 1/2 b*h
        return 0.5 * base * height;
    }

   
    public static void main(String[] args) {                               // Main method 

        double base = 50 ;
        double height = 25;

        double area = calculateArea(base, height);                          //calling from main 

        System.out.println("Area of Triangle = " + area);
    }
}