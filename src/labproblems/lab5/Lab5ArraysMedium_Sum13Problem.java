package labproblems.lab5;

public class Lab5ArraysMedium_Sum13Problem {
	
	public static int sum13(int[] nums) {
		/* Lab Problem:
		 * Return the sum of the numbers in the array, returning 0 for an empty array. 
		 * Except the number 13 is very unlucky, so it does not count and numbers that come 
		 * immediately after a 13 also do not count. 
		 * 
		 *	 sample run of the program:
		 * 		sum13([1, 2, 2, 1]) → 6 
		 * 		sum13([1, 1]) → 2 
		 * 		sum13([1, 2, 2, 1, 13]) → 6
		 * 
		 * */
		
		// TODO Lab Solution:

	}

	// sample usage of sum13
	public static void main(String[] args) {
		System.out.println(sum13(new int[]{1, 2, 2, 1})); // 6
		System.out.println(sum13(new int[]{1, 1})); // 2 
		System.out.println(sum13(new int[]{1, 2, 2, 1, 13})); // 6
	}
}
