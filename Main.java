public class EquilityChecker {

	public static void main(String[] args) {
		int A[] = { 1, 2, 5, 4, 0 };
		int B[] = { 1, 2, 5, 4, 0 };

		System.out.println(checkArray(A, B));

	}

	public static boolean checkArray(int A[], int B[]) {
		boolean result = true;
		if (A.length == B.length) {

			for (int i = 0; i < A.length; i++) {
				if (A[i] != B[i])
					result = false;
				else 
					result =true;
			}
		}
		return result;
	}
}
