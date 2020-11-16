package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReadingLineService {
public ArrayList<String> findWords(String sr, int words) {
	System.out.println("Enter string(s) to be serached : ");
	Scanner scan=new Scanner(System.in);
	String str1;
	ArrayList<String> subStrings = new ArrayList<>();
	
	for(int i=0;i<words;i++) {
		str1=scan.next();
		subStrings.add(str1);
	}
	
	
	for (int i = 0; i < subStrings.size(); i++) {
		
	if(sr.contains(subStrings.get(i)) ) {
		 System.out.println("Found: "+subStrings.get(i));
	}
	     
	    }
	
	return (subStrings);
}
}
