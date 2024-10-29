package labproblems.lab15;

public class Range implements NumberGroup {

	private double low;
	private double high;
	
	public Range(double lowBound, double highBound) {
		low = lowBound;
		high = highBound;
	}
	
	@Override
	public boolean contains(double number) {
		return number >= low && number <= high;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Range)) {
			return false;
		}
		Range otherRange = (Range) other;
		return low == otherRange.low && high == otherRange.high;
	}
	
	public boolean overlaps(Range other) {
        // TODO Add an overlaps method to Range, 
		// which determines whether this Range 
		// has any numerical overlap with another Range.
	
	}

}