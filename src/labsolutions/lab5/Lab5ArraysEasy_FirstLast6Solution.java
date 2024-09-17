package labsolutions.lab5;

public class Lab5ArraysEasy_FirstLast6Solution {

	public static boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length-1]==6){
			return true; 
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		int[] arr1 = new int[] {1,2,6};
		System.out.println(firstLast6(arr1)); // true
		System.out.println(firstLast6(new int[]{6, 1, 2, 3})); // true 
		System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3})); // false
	}
}
