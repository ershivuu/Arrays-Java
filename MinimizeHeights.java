/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.
*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 3, 9, 12, 16, 20 };
		System.out.println(Arrays.toString(arr));
		int K = 3;
		int N = arr.length;
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				arr[i] = arr[i] + K;
			} else {
				arr[i] = arr[i] - K;
			}
			// System.out.println(arr[i]);
		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res = arr[N - 1] - arr[0];
		System.out.println("Output :" + res);

	}

}
