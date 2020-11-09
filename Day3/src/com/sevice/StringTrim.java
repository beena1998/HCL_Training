package com.sevice;

public class StringTrim {
	
	public String trimIt(String str, int num1, int num2) {
		String str2=null;
		char c;
		for(int i=num1;i<num2;i++) {
			if(i==num1) {
				c=str.charAt(i);
				str2=Character.toString(c);
			}
			else {
		str2=str2+str.charAt(i);}
		System.out.println(str2);
		
		
	}
return str2;
}
}