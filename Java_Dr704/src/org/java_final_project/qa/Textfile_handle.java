
package org.java_final_project.qa;

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class Textfile_handle {
    public static void main(String[] args) throws Exception {

        // Writing 
        FileWriter fw = new FileWriter("transaction.txt");

        fw.write("5000\n");
        fw.write("-2500\n");
        fw.write("8000\n");
        fw.write("0\n");

        fw.close();

        System.out.println("File written successfully.");

        // Reading data from transaction.txt
        FileReader fr = new FileReader("transaction.txt");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()) {
            double amount = Double.parseDouble(sc.nextLine());

            if (amount > 0) {
                System.out.println(amount + " : VALID");
            } else {
                System.out.println(amount + " : INVALID");
            }
        }

        sc.close();
        fr.close();
    }
}
