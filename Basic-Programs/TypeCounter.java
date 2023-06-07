package Strings;

import java.util.Scanner;

public class TypeCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		// "Hello my 50 name 4.5 is James, I 20 years old and i have 5.7 coins";
		System.out.println(string);
		countTypeInString(string);
	}

	public static void countTypeInString(String string) {

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
