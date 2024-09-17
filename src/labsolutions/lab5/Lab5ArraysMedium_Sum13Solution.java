package labsolutions.lab5;

public class Lab5ArraysMedium_Sum13Solution {
	
	public static int sum13(int[] nums) {
		
	    // Initialize sum to 0
	    int sum = 0;
	    
	    // Loop through the array
	    for (int i = 0; i <= nums.length-1; i++) {
	        // If we encounter a 13, skip it and the next number
	         if (nums[i] == 13) {
	            i++;  // Skip the next number
	        } else {
	            // Otherwise, add the number to the sum
	            sum += nums[i];
	        }
	    }
	        
	    // Return the final sum
	    return sum;
	}

	// sample usage of sum13
	public static void main(String[] args) {
		System.out.println(sum13(new int[]{1, 2, 2, 1})); // 6
		System.out.println(sum13(new int[]{1, 1})); // 2 
		System.out.println(sum13(new int[]{1, 2, 2, 1, 13})); // 6
	}
}