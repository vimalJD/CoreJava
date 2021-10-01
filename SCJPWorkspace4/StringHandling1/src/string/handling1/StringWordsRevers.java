//Write a program to reverse the words in the string objects

package string.handling1;

public class StringWordsRevers {

	public static String reverseStringWords(String s) {

		String[] stringWords = s.split(" ");

		String resultString = "";

		for (int i = stringWords.length - 1; i >= 0; i--) {

			resultString += stringWords[i] + "";
		}
		return resultString;

	}
}
