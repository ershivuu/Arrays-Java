package Strings;

public class ReverseString {

	public static void main(String[] args) {
		char s[] = { 's', 'h', 'i', 'v', 'u' };
		reverse(s);
	}

	public static void reverse(char[] s) {
		int n = s.length;
		for (int i = 0; i < n / 2; i++) {
			char temp = s[i];
			s[i] = s[n - i - 1];
			s[n - i - 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
