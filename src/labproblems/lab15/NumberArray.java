package labproblems.lab15;

public class NumberArray implements NumberGroup {

	private double[] nums;
	
	public NumberArray(double[] numbers) {
		nums = new double[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			nums[i] = numbers[i];
		}
	}
	
	@Override
	public boolean contains(double number) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	public boolean overlaps(NumberArray other) {
        // TODO Add an overlaps method to NumberArray, 
		// which determines this NumberArray has any 
		// overlap with another NumberArray.
		
	}

}