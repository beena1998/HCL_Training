package com.service;

import appexception.UserDefinedException;

public class MyCalculator {
	public long power(int input1, int input2) throws UserDefinedException {
		int pow = 1;
		if (input1 > 0 && input2 > 0 && input1!=0 && input2!=0) {
			for (int i = 0; i < input1 ; i++) {
				pow *= input2;
				
			}
			return pow;
		} else if (input1 < 0 && input2 < 0) {
			System.out.println("he");
			throw new UserDefinedException();
		}

		else if (input1 == 0 && input2 == 0) {
			throw new UserDefinedException();
		}
		return pow;
	}
}
