package com.awinas.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkingWithFile {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\gbs05349\\Desktop\\PhText.doc");

		try {
			Scanner myReader = new Scanner(myObj);
			String line;
			if (myReader.hasNextLine()) {
				line = myReader.nextLine();
				String[] arr = line.split(" ");
				//for()
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
