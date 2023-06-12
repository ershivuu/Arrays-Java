/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
*/
public class CommonElement {

	public static void main(String[] args) {

		int[] A = { 1, 5, 10, 20, 40, 80 };
		int[] B = { 6, 7, 20, 80, 100 };
		int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
		Find(A, B, C);
	}

	public static void Find(int[] a, int[] b, int[] c) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					if (a[i] == b[j] && b[j] == c[k])
						System.out.println(c[k]);
				}
			}
		}
	}
}
