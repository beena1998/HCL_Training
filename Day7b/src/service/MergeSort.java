package service;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		array1.addAll(array2);
		Collections.sort(array1);

		ArrayList<Integer> array3 = new ArrayList<Integer>();
		array3.add(array1.get(2));
		array3.add(array1.get(6));
		array3.add(array1.get(8));
		return array3;

	}

}
