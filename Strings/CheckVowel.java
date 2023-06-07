package Questions;

import java.io.PrintStream;

public class CheckVowel {

	public static void main(String[] args) {

		String s = "testing12345";
		s = s.toLowerCase();

		int sLength = s.length();
		int vCount = 0;// vowel count is vCount
		int nCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vCount++;
			} else if (Character.isDigit(s.charAt(i))) {
				nCount++;
			}
		}
		float vobleCount = vCount;
		vobleCount = (vobleCount / sLength) * 100;

		float numberCount = nCount;
		numberCount = (numberCount / sLength) * 100;

		// double Npercent = (nCount / s.length()) * 100;

		System.out.println("Number of Vowels are: " + vCount + " (" + vobleCount + " %)");
		System.out.println("Number of integers are: " + nCount + " (" + numberCount + " %)");
	}

}
