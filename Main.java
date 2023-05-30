package InputIntoArrayFromUser;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[20];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an integer");
			int num = s.nextInt();
			
			if (num == 0)
				break;
			
			arr[i] = num;
			count++;
		}
		System.out.println("Elements are :" + Arrays.toString(arr));
		int nonZero = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] != 0) {
				nonZero++;
			}
		}
		System.out.println("Total number of non Zeros are :" + nonZero);
		System.out.println("Addition is :" + sum);
		System.out.println("Average of an array is :" + sum/nonZero);
	}

}
