package Strings;

public class Duplicate {

	public static void main(String[] args) {

		String s = "Great responsibility";
		duplicate(s);
	}

	public static void duplicate(String s) {
		char str[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j] && str[i] != ' ') {
					count++;
					System.out.println(str[i] + " = " + count);

				}
			}
		}
	}

}
