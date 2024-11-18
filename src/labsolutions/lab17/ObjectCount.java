package labsolutions.lab17;

public class ObjectCount<T> {
	
	private final T object;
	private int count;
	
	public ObjectCount(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
	
	public int getCount() {
		return count;
	}
	
	public void incrementCount() {
		count++;
	}
}
/*
 Why use the final modifier in this context?
 
	Immutable Reference:
		Declaring object as final ensures that the ObjectCount instance will 
		always refer to the same object throughout its lifetime.
		Even though the contents of the object might be mutable (if it is a mutable type), 
		the reference itself cannot point to a different object after being set in the constructor.
	
	Thread Safety:
		Marking object as final can contribute to making the class safer in multithreaded 
		environments because once the object is assigned, no other thread can change its reference. 
		This helps prevent unexpected changes or errors due to concurrent access.

	Design Intent:
		Making object final clarifies the design intent: each instance of ObjectCount is meant to 
		track a specific object without changing to a different one.
		
		This is especially useful in cases like this where the class is intended to track the 
		count of occurrences of a single object; it makes logical sense to prevent that object 
		from being reassigned.
 */