package BasicPrograms;
/*compare the two given strings*/
public class compare {
	public static void main(String[] args) {

		String s1 = "Shivam";
		String s2 = "shivam";

		String s3 = s1.toUpperCase();
		String s4 = s2.toUpperCase();

		if (s3.compareTo(s4) == 0) {
			System.out.println(s3.length() + " " + s4.length() + " equal");
		} else {
			System.out.println("not equal");
		}

	}

}
