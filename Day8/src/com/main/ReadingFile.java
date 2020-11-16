package com.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.service.ReadingLineService;

/*
 * Write a Java program to write and read a plain text file. 
 * 
 * @BEENA KANDPAL
 * 
 */

public class ReadingFile {

	public static void main(String a[]) {
		StringBuilder stringBuilder = new StringBuilder();
		String strLine = "";
		try {
			String filename = "E:\\BEENA FOLDER\\read.txt";
			FileWriter fileWriter = new FileWriter(filename, false);

			fileWriter.write("chennaisuperkingsvsroyalchallengerbangalore");
			fileWriter.close();

			/*
			 * BufferedReader bufferedReader = new BufferedReader(new
			 * FileReader("E:\\BEENA FOLDER\\read.txt")); int i=1; while
			 * (strLine.equals("")) {
			 * 
			 * stringBuilder.append(strLine); stringBuilder.append(System.lineSeparator());
			 * strLine = bufferedReader.readLine(); System.out.println(strLine);
			 * System.out.println(i++); } // System.out.print(strLine);
			 * bufferedReader.close();
			 */

			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("E:\\BEENA FOLDER\\read.txt"), "UTF-8"));
			int words;
			System.out.println("Enter the number of words : ");
			Scanner scan=new Scanner(System.in);
			words=scan.nextInt();
			while (((strLine = reader.readLine()) != null)) {
				ReadingLineService lineService = new ReadingLineService();
				ArrayList<String >res=lineService.findWords( strLine, words);
				System.out.println(res);
				
				
//				System.out.println(strLine);

			}
			
			
			
			

		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

}
