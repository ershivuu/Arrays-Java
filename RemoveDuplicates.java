package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6,6 };
		int n = a.length;

		int j = remove(a, n);
		for (int i = 0; i < j; i++)
			System.out.print(a[i] + " ");
	}

	public static int remove(int[] a, int n) {
		// n is the size of the array...
		// a is the initialization of the array.
		if (n == 0 || n == 1) {
			return n; // if the size of the array is zero or one return the number
		}
		// j is temporary Variable...
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		return j;
	}
}