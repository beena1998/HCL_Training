package main;

/*
 * Merge and sort the array.
 * Print the elements at position 2,6 and 8.
 * 
 * @BEENA KANDPAL
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

import service.MergeSort;

public class SortMergeMain {

	public static void main(String[] args) {

		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();

		System.out.println("Enter elements in array 1:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++)
			array1.add(scan.nextInt());

		System.out.println("Enter elements in array 1:");
		for (int i = 0; i < 5; i++)
			array2.add(scan.nextInt());
		
		ArrayList<Integer> array3=MergeSort.mergeSort(array1,array2);
		//System.out.println(ans);
		for(int k=0;k<3;k++)
		System.out.println(array3.get(k));

	}

}
