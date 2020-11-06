package service;

import java.lang.String;

public class LongestWord {

	public static String getLargestWord(String string) {
		int length = string.length();
		int max_length = 0;
		int index = 0;
		int i = 0;
		int j = 0;
		while (i <= length) {
			if (i < length && string.charAt(i) != ' ') {
				i++;
			}

			else {
				int curr_length = i - j;

				if (curr_length > max_length) {
					max_length = curr_length;
					index = j;
				}
				i++;
				j = i;
			}
		}
		String maxWord = string.substring(index, max_length);
		System.out.println(maxWord);
		return maxWord;

	}

}
