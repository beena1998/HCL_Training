package com.sevice;

public class Search {

	
	public int findElement(int[] a, int ele, int length) {
		
		int found = 0;
		for (int i=0;i<length;i++) {
			if(ele==a[i]) {
				found= a[i];
				break;
			}
		}
		if(found!=0)
		   return 1;
		else 
			return 0;
	}
}
