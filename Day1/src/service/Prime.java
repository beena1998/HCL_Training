package service;

public class Prime {
	public void CheckPrime(int number) {
		int i;
		int flag = 0;
		int m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " is prime number");
			}
		}
	}
}
