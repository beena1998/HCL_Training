package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Write a Java program to write and read a plain text file. 
 * 
 * @BEENA KANDPAL
 * 
 */

public class WriteReadFile {

	public static void main(String a[]) {
		StringBuilder stringBuilder = new StringBuilder();
		String strLine = "";
		try {
			String filename = "E:\\BEENA FOLDER\\bee.txt";
			FileWriter fileWriter = new FileWriter(filename, false);

			fileWriter.write("BEENA'S WORK");
			fileWriter.close();
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\BEENA FOLDER\\bee.txt"));
			
			while (strLine != null) {
				stringBuilder.append(strLine);
				stringBuilder.append(System.lineSeparator());
				strLine = bufferedReader.readLine();
				System.out.println(strLine);
			}
			bufferedReader.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

}
