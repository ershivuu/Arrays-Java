 package Strings;

import java.util.LinkedList;
import java.util.Queue;

public class StringRotation {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "ACBD";

		if (checkRotation(str1, str2) == true)
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");

	}

	public static boolean checkRotation(String s, String s2) {
		if (s.length() != s2.length())
			return false;

		Queue<Character> q1 = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			q1.add(s.charAt(i));
		}

		Queue<Character> q2 = new LinkedList<>();
		for (int i = 0; i < s2.length(); i++) {
			q2.add(s2.charAt(i));
		}

	//	for (int k = 0; k < s2.length(); k++)
		 for (int k = s2.length(); k > 0; k--)
		{
			char ch = q2.peek();
			q2.remove();
			q2.add(ch);
			if (q2.equals(q1))
				return true;
		}
		return false;

	}

}
