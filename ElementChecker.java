/* check whether all the elements of one array is contained by another array or not,
elements in arrays may be repeated, will be checked once.*/
import java.util.Arrays;
public class ElementChecker {

	public static void main(String[] args) {

		int A[] = { 12, 3, 14, 14 }; 
              // array A has element 14 two times but it will be counted as one while checking the elements in other array B
		int B[] = { 14, 12, 3, 9 };
		Arrays.sort(A);
		Arrays.sort(B);
		System.out.println(checkElements(A, B));

	}

	public static boolean checkElements(int A[], int B[]) {
		boolean result = true;
		if (A.length == B.length) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] != B[i])
					result = false;
				else
					result = true;
			}
		} else
			result = false;
		return result;
	}
}
