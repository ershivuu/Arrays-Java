/* find the duplicates in an array and print the duplicate element of an array using java*/
public class DuplicateInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2 };
		findDuplicate(arr);
	}
	
	public static void findDuplicate(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println(nums[j]);
				}
			}
		}
	}

}
