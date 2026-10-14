package org.project.basic.qa;
import java.util.Scanner;
public class Transaction_validation {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        if (withdraw > 0 && withdraw <= balance) {
            balance = balance - withdraw;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}

