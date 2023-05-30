// find(search) the number in an array using java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = { 1, 2, 3, 4, 4, 5 };
		int x = sc.nextInt();

		// liner Searching...
		for (int i = 0; i < array.length; i++) {

			if (array[i] == x) {
				System.out.println("Index of the Number : X :  " + i);
			} else
				System.out.println("Processing... ");
		}
	}
}
