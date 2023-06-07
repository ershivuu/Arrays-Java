package Arrays;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(mySqrt(17));
	}

	public static int mySqrt(int x) {

		long r = x;
		while (r * r > x)
			r = (r + x / r) / 2;
		return (int) r;
	}
}
