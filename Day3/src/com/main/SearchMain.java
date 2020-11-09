package com.main;

import java.util.Scanner;

import com.sevice.Search;

public class SearchMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.print("Enter the element you want to search:");
		int searchElement=scan.nextInt();
		Search search= new Search();
		int res=search.findElement(a,searchElement, n);
		
		if(res==1)
		System.out.println("Element "+searchElement+" found at");
		scan.close();
		search=null;

	}

}
