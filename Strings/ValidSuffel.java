package Strings;

import java.util.Arrays;

public class ValidSuffel {

	public static void main(String[] args) {
		String str1 = "geekforgeeks";
		String str2 = "ekegorfkeegsgeek";

		boolean a = isShuffledSubString(str1, str2);

		if (a)
			System.out.print("YES");
		else
			System.out.print("NO");
		System.out.println();

	}

	public static boolean isShuffledSubString(String A, String B) {
		int n = A.length();
		int m = B.length();

		if (n > m)
			return false;
		else {
			A = sort(A);

			for (int i = 0; i < m; i++) {
				if (i + n - 1 >= m)
					return false;

				String str = "";

				for (int j = 0; j < n; j++)
					str += B.charAt(i + j);

				str = sort(str);
				if (str.equals(A))
					return true;
			}
		}
		return false;

	}

	public static String sort(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return String.valueOf(tempArray);
	}

}
