package labsolutions.lab5;

public class Lab5ArraysHard_MaxSpanSolution {
    public static int maxSpan(int[] nums) {
        // Initialize maxSpan to 0
        int maxSpan = 0;
        
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Get the leftmost occurrence of the current element (which is 'i' itself)
            int left = i;
            
            // Find the rightmost occurrence of the current element by looping through the array
            int right = i;
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == nums[i]) {
                    right = j;
                    break;
                }
            }
            
            // Calculate the span (right - left + 1)
            int span = right - left + 1;
            
            // Update maxSpan if the current span is larger
            maxSpan = Math.max(maxSpan, span);
        }
        
        // Return the largest span
        return maxSpan;
    }

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[] {1, 2, 1, 1, 3}));   // Output: 4
        System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4})); // Output: 6
        System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4})); // Output: 6
    }
}