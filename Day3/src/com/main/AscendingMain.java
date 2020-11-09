package com.main;

import java.util.Scanner;

import com.sevice.Ascending;

public class AscendingMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		Ascending ascending = new Ascending();
		int[] res = ascending.sort(a, n);
		System.out.print("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(res[i] + ",");
		}
		System.out.print(res[n - 1]);
		scan.close();
		ascending = null;
	}

}
