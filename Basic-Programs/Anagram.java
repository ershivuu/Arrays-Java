package Strings;

/*
Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. 
So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. 
The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.
This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1
anagram
margana

Sample Output 1:
Anagrams
*/
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length()) {
			return false;
		}
		int[] arr = new int[26];

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			int index = ch - 'a';
			arr[index]++;
		}
		for (int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			int index = ch - 'a';
			arr[index]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
