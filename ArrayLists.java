/* Java Arraylist
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. 
Try to solve this problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries 
where you need to tell the number located in yth position of xth line. 
Take your input from System.in.
Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number 
of integers on that line and then there will be d space-separated integers. In the next line there will 
be an integer q denoting number of queries. Each query will consist of two integers x and y.
Constraints
1<=n<=20000
0<=d<=50000
1<=q<=1000
1<=x,y<=n
Each number will fit in signed integer.
Total number of integers in n lines will not cross 100000.
Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output
74
52
37
ERROR!
ERROR!

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Number of rows
        int N = in.nextInt();
        // Create a 2D ArrayList to store the value
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // Initialize the row of the 2D array
        for (int i = 0; i < N; i++){
            list.add(new ArrayList<Integer>());
            // Number of columns
            int C = in.nextInt();
            // Store the value to each column
            for (int j = 0; j < C; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Number of queries
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {
            // Row and Column number from the queries
            int row = in.nextInt();
            int col = in.nextInt();
            /*
            If queries for the row is larger than N and col in a particular row is also
            out of bounds then print "Error!"
             */
//            try{
//                System.out.println(list.get(row - 1).get(col - 1));
//            }
//            catch(Exception e){
//                System.out.println("ERROR!");
//            }
//        }
//        in.close();
//    }
//}

package DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLists{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// Scanner Created.
		int numLines = Integer.parseInt(sc.nextLine());
		ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();// First ArrayList Created.
		for (int i = 0; i < numLines; i++) {
			int numOfIntegers = sc.nextInt();
			ArrayList<Integer> intArrayList = new ArrayList<Integer>();// second ArryaList Created.
			for (int j = 0; j < numOfIntegers; j++) {
				intArrayList.add(new Integer(sc.nextInt()));// adding elements to the ArrayList.
			}
			listArray.add(intArrayList);// adding the same integer add to intArrayList to listArray
			sc.nextLine();
		}
		// fetching an element from the array list.
		int numQueries = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numQueries; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			sc.nextLine();
			if (x < listArray.size() && y < listArray.get(x).size()) {
				System.out.println(listArray.get(x).get(y));
			} else {
				System.out.println("ERROR!");
			}
		}

	}

}
