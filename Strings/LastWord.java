package Strings;

/*
 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
 */
public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("hello Shivuu"));
	}

	public static int lengthOfLastWord(String s) {
		int length = 0;

		String x = s.trim();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ') {
				length = 0;
			} else {
				length++;
			}
		}
		return length;
	}

}
