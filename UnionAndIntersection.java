package unionAndIntersection;

import java.util.HashSet;

public class Union {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 8 };
		int n = a.length;
		int m = b.length;
		int x = doUnion(a, n, b, m);
		System.out.println(x);
	}

	public static int doUnion(int a[], int n, int b[], int m) {

		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++)
			s.add(a[i]);

		for (int i = 0; i < m; i++)
			s.add(b[i]);
		
		System.out.println(s);
		return s.size();
	}

}
