package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloName {

	public static void main(String args[])throws Exception{             
	    InputStreamReader read=new InputStreamReader(System.in);    
	    BufferedReader bufferRead=new BufferedReader(read);            
	    System.out.println("Enter your name");    
	    String name=bufferRead.readLine();    
	    System.out.println("Welcome "+name);    
	}    
}
