/*
Task
The code in your editor does the following:

1.Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
2.Reads n integers corresponding to a0,a1....an-1 from stdin and saves each integer ai to a variable, val.
3.Attempts to print each element of an array of integers named a .

Write the following code in the unlocked portion of your editor:

1.Create an array,a, capable of holding n integers.
2.Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
 For example, the first value must be stored in a0, the second value must be stored in a1, and so on.

Good luck!
Input Format
The first line contains a single integer, , denoting the size of the array. 
Each line  of the  subsequent lines contains a single integer denoting the value of element .
Output Format
You are not responsible for printing any output to stdout. Locked code in the editor loops through array  
and prints each sequential element on a new line.
Sample Input
5
10
20
30
40
50
Sample Output 
10
20
30
40
50
Explanation
When we save each integer to its corresponding index in , we get . The locked code prints each array element on a new line from left to right.
*/
package DataStructure;

import java.util.*;

public class Java1DArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
