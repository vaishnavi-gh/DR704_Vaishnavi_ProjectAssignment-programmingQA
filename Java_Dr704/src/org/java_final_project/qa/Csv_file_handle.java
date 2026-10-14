
package org.java_final_project.qa;

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class Csv_file_handle {
	public static void main(String[] args) throws Exception {

		System.out.println("create and write csv file ");
		FileWriter fw = new FileWriter("transactions.csv");

		fw.write("transaction_id,amount\n");
		fw.write("101,5000\n");
		fw.write("102,-2500\n");
		fw.write("103,0\n");

		fw.close();

		System.out.println("Read csv file ");
		FileReader fr = new FileReader("transactions.csv");
		Scanner sc = new Scanner(fr);

		sc.nextLine();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] data = line.split(",");

			int id = Integer.parseInt(data[0]); // text --- integer
			double amount = Double.parseDouble(data[1]); // amount --- double

			if (amount > 0) {
				System.out.println(id + " : VALID");
			} else {
				System.out.println(id + " : INVALID");
			}
		}

		sc.close();
		fr.close();
	}
}
