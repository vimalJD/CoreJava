package string.handling1.bufferbuilder;

public class StringWordsReverse {

	public static String reverseStringWords(String s) {

		String[] stringWords = s.split(" ");
		int noOfWords = stringWords.length;

		StringBuffer resultBuffer = new StringBuffer();

		for (int i = noOfWords - 1; i >= 0; i--) {

			resultBuffer.append(stringWords[i]);
			resultBuffer.append(" ");
		}

		// removing last space character
		return resultBuffer.toString().trim();

	}

	public static void main(String[] args) {

		System.out.println(reverseStringWords("How Are You"));
	}
}
