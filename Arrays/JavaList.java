/* Java List
For this problem, we have  types of queries you can perform on a List:
Insert  at index :
Insert
x y

Delete the element at index :
Delete
x

Given a list, l, of N integers, perform Q queries on the list. Once all queries are completed, 
print the modified list as a single line of space-separated integers.

Input Format
The first line contains an integer, N (the initial number of elements in L). 
The second line contains N space-separated integers describing L. 
The third line contains an integer, Q (the number of queries). 
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains 
two space separated integers x,y and the value y must be inserted into L at index x.

If the first line of a query contains the String Delete, then the second line contains index x, 
whose element must be deleted from L.

Constraints
1<=N<=4000
1<=Q<=4000
Each element in is a 32-bit integer.

Output Format
Print the updated list  as a single line of space-separated integers.
Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output
0 1 78 12 23
 
*/
package DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int listSize = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < listSize; i++) {
			list.add(scan.nextInt());
		} // System.out.println(list);

		// Inserting and deleting queries.
		int queries = scan.nextInt();

		for (int i = 0; i < queries; i++) {
			String query = scan.next();
			// System.out.println(query+"i:"+i);
			if (query.equals("Insert")) {
				list.add(scan.nextInt(), scan.nextInt());
			} else if (query.equals("Delete")) {
				list.remove(scan.nextInt());
			}
		}

		// printing the list.
		for (Integer i : list) {
			System.out.printf("%d ", i);
			
		}
	}
}
