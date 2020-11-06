package service;

public class UserMainCodeForEvenDigits {

	public static double sumOfSquaresOfEvenDigits(int num)
	{
		double sum = 0;
		while (num > 0) {

			if ((num % 10) % 2 == 0) {
				sum += Math.pow((num % 10),2);
				

			}
			num = num / 10;
		}
		return sum;

	}

}
