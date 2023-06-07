package Strings;

import java.util.Scanner;

public class TypeCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		// "Hello I am shivam Gupta and my height is 5 feet 8 inches and 8 inches";
		System.out.println(string);
		countTypeInString(string);
	}

	public static void countTypeInString(String string) {

		// create an array of type string and insert the string in the array.
		// string.split splits the string according to the condition give in the brackets
		String[] value = string.split(" ");

		double ifDouble;
		int ifInt;
		String ifString;
		int counter = 0;

		// count Doubles
		for (String i : value) {
			try {
				ifDouble = Double.parseDouble(i);
				if (i.contains(".")) {
					counter++;
					continue;
				}
			} catch (NumberFormatException e) {
			}
		}
		System.out.println("Double " + counter);

		// count ints
		counter = 0;
		for (String i : value) {
			try {
				ifInt = Integer.parseInt(i);
				counter++;
				continue;
			} catch (NumberFormatException e) {
			}

		}
		System.out.println("Int " + counter);

		// counts strings
		String S = string.replaceAll("[0-9.]", "");
		S = S.replaceAll("  ", " ");
		String[] value2 = S.split(" ");
		System.out.println("String " + value2.length);

	}

}
