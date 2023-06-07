package minMax;

import java.util.Arrays;

public class TwoLargest {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		printTwoLargest(arr);
		System.out.println("");
		printTwoMinumum(arr);
		System.out.println("\nusing sorts \n");
		usingSort(arr);

	}

	public static void printTwoLargest(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > max) {
				secondMax = max;
				max = i;
			}

			if (i > secondMax && i < max) {
				secondMax = i;
			}
		}

		System.out.println("Max : " + max);
		System.out.println("Second Max :" + secondMax);
	}

	public static void printTwoMinumum(int[] arr) {
		int max = Integer.MAX_VALUE;
		int secondMax = Integer.MAX_VALUE;

		for (int i : arr) {
			if (i < max) {
				secondMax = max;
				max = i;
			}

			if (i < secondMax && i > max) {
				secondMax = i;
			}
		}

		System.out.println("Min : " + max);
		System.out.println("Second Min  :" + secondMax);
	}

  // using inubuilt of Arrays i.e., Arrays.sort
	public static void usingSort(int[] arr) {

		Arrays.sort(arr);
		int last = arr.length - 1;
		int secondLast = arr.length - 2;
		System.out.println("Max :" + arr[last]);
		System.out.println("Seond Max :" + arr[secondLast]);

	}

}
