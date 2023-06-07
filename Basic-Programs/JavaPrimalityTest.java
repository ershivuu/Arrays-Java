/*
 * A prime number is a natural number greater than whose only positive divisors
 * are and itself. For example, the first six prime numbers are 2,3,4,5,11 and 13.
 * 
 * Given a large integer, , use the Java BigInteger class' isProbablePrime
 * method to determine and print whether it's prime or not prime.
 * 
 * Input Format: 
 * A single line containing an integer, (the number to be checked).
 * 
 * Constraints: 
 * contains at most digits.
 * 
 * Output Format: 
 * If is a prime number, print prime; otherwise, print not prime.
 * 
 * Sample Input: 
 * 13
 * 
 * Sample Output: 
 * prime
 */
package Integers;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class JavaPrimalityTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String n = bufferedReader.readLine();
		Scanner in = new Scanner(System.in);
		BigInteger m =in.nextBigInteger();
	
		if (m.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		bufferedReader.close();

	}

}
