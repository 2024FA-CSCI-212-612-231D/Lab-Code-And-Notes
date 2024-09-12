package labproblems.lab5;

public class Lab5ArraysHard_MaxSpanProblem {
    public static int maxSpan(int[] nums) {
       /*Lab Problem:
        * Consider the leftmost and rightmost appearances of some value in an array. 
        * We'll say that the "span" is the number of elements between the two inclusive. 
        * A single value has a span of 1. Returns the largest span found in the given array. 
        * (Efficiency is not a priority.)
        * 
        * sample runs of the program:
        * 	maxSpan([1, 2, 1, 1, 3]) → 4
        * 	maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
        * 	maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
        * */
    	
    	// TODO Lab Solution:
    	
    }

    // sample usage of maxSpan
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[] {1, 2, 1, 1, 3}));   // Output: 4
        System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4})); // Output: 6
        System.out.println(maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4})); // Output: 6
    }
}