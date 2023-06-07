/* Java 2D Array
You are given a 6∗6 2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.
Input Format
There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between −9 and 9 inclusive.
Output Format
Print the answer to this problem on a single line.
Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output
19 
*/
package DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] numArray = new String[6][];
		int largestSum = 0;
		for (int i = 0; i < 6; i++) {
			numArray[i] = sc.nextLine().split(" ");
		}

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int sum = Integer.parseInt(numArray[i][j]) + Integer.parseInt(numArray[i][j + 1])
						+ Integer.parseInt(numArray[i][j + 2]) + Integer.parseInt(numArray[i + 1][j + 1])
						+ Integer.parseInt(numArray[i + 2][j]) + Integer.parseInt(numArray[i + 2][j + 1])
						+ Integer.parseInt(numArray[i + 2][j + 2]);
				if (i == 0 && j == 0) {
					largestSum = sum;
				} else {
					if (sum > largestSum) {
						largestSum = sum;
					}
				}
			}
		}
		System.out.println(largestSum);
	}
}
/* public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] h = new int[6][6];
        for (int i=0;i<6;++i)
            for (int j=0;j<6;++j)
                h[i][j] = sc.nextInt();
            
        int m = -10000;
        for (int i=0;i<=3;++i){
            for (int j=0;j<=3;++j){
                int s = h[i][j] + h[i][j+1] + h[i][j+2] + h[i+1][j+1] + h[i+2][j] + h[i+2][j+1] + h[i+2][j+2];
                if (s>m) m=s;
            }
        }
        System.out.println(m);
    }*/
