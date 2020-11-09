package com.sevice;

public class CheckPalindrome {
public String palindromeYesNo(String str) {
	int len=str.length();
	String str2=null;
	char c;
	for(int i=len-1;i>=0;i--) {
		if(i==len-1) {
		c=str.charAt(i);
		str2=Character.toString(c);
		}
		else {
			str2=str2+str.charAt(i);
		}
		
		System.out.println(str2);
	}
	if(str2.equalsIgnoreCase(str)) {
		return "yes";
	}
	else
		return "no";
	
}
}
