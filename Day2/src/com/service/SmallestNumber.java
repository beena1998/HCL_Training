package com.service;

public class SmallestNumber {
	public int findSmallest(int num1, int num2, int num3) {
		return Math.min(Math.min(num1, num2), num3);
	}
}
