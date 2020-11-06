package com.service;

import java.util.ArrayList;

public class Addition {
	public void addition1(int numb) {

		int sum = 0;
		ArrayList<String> mylist = new ArrayList<String>();

		for (int i = 1; i < numb; i++) {
			mylist.add(Integer.toString(i) + "+ " + Integer.toString(i + 1));
//			str[i] = Integer.toString(i) + "+ " + Integer.toString(i + 1);
			sum = ((i + 1) * (i + 2)) / 2;
			System.out.println(mylist + "=" + sum);

		}

	}

}
