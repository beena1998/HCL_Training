package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/*
 * Write a Java program to read first 3 lines from a file. 
 * 
 * @BEENA KANDPAL
 * 
 */

public class ReadLines {

	public static void main(String a[]) {

		String strLine = "";
		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("E:\\BEENA FOLDER\\bee.txt"), "UTF-8"));
			while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(strLine);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}
}
