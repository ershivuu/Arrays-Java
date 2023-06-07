package Strings;

import java.util.Scanner;

/*
The first line contains a string . The second line contains another string . 
The strings are comprised of only lowercase English letters.


lexicographically larger:  
Lexicographically means in dictionary order,i.e.if two strings are compared based on dictionary 
position the string which comes afterwards is said to be Lexicographically greater.
Output Format
There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input
hello
java

Sample Output
9
No
Hello Java
*/
public class StringIntro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		System.out.println(A.length() + B.length());
		if (A.compareTo(B) < 0) {
			System.out.println("No");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);
		} else if (A.compareTo(B) == 0) {
			System.out.println("No");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);
		} else {
			System.out.println("Yes");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);
		}

	}
}
