package Arrays;
/*Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
Therefore it is not a palindrome.*/

public class ReverseNumber {
	public boolean isPalindrome(int x) {
		int original = x;
		int reverse = 0;
		if (original < 0)
			return false;
		while (x != 0) {
			int remainder = x % 10;
			reverse = (reverse * 10) + remainder;
			x /= 10;
		}
		if (original == reverse) {
			return true;
		} else {
			return false;
		}
	}
}
