package minMax;

public class MinMax{
	public static void main(String[] args) {

		int arr[] = { 10, 25, 45, 85, 14, 1, 98 };

		// min max elements...
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest number is  : " + max);
		System.out.println("Smallest number is : " + min);
	}
}
