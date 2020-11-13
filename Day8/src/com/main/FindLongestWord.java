package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Write a Java program to find the longest word in a text file. 
 * 
 * @BEENA KANDPAL
 * 
 */

public class FindLongestWord {
	
	 public static void main(String [ ] args) throws FileNotFoundException {
        

  String longest_word = "";
  String current;
  Scanner scan = new Scanner(new File("E://BEENA FOLDER//bee.txt"));


  while (scan.hasNext()) {
     current = scan.next();
      if (current.length() > longest_word.length()) {
        longest_word = current;
      }

  }
    System.out.println("Longest word in the file is : "+longest_word);
     
       }

}
