/*Check whether the two given arrays are equal or not
i.e., length of the arrays must be same as well as elements of the arrays must be same*/
public class EquilityChecker {

	public static void main(String[] args) {
		
		int A[] = { 1, 2, 5, 4, 0 }; // array1
		int B[] = { 1, 2, 5, 4, 0 }; // array2

		System.out.println(checkArray(A, B)); // calling and printing the checkArray method and its output 

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
