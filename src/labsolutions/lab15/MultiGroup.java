package labsolutions.lab15;

import java.util.ArrayList;
import java.util.List;

public class MultiGroup implements NumberGroup {
	
	private List<NumberGroup> groups;

	public MultiGroup(List<NumberGroup> numberGroups) {
		groups = new ArrayList<NumberGroup>(numberGroups);
	}

	@Override
	public boolean contains(double number) {
		for(NumberGroup group : groups) {
			if(group.contains(number)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Note: the MultiGroup class uses polymorphism 
	 * by working with multiple different implementations 
	 * of the NumberGroup interface (Range, NumberArray)
	 * 
	 * The interface NumberGroup defines a contract:
	 *     public interface NumberGroup {
     *         boolean contains(double number);
     *     }
	 * 
	 * Any class implementing NumberGroup (Range or NumberArray) 
	 * must provide its own specific implementation of the 
	 * contains method. 
	 * This is the basis for polymorphism since each class can 
	 * implement contains in its way, while MultiGroup can treat 
	 * them uniformly as NumberGroup objects.
	 * 
	 * */

}