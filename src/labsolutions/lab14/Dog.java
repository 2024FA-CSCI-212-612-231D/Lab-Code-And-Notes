package labsolutions.lab14;

public class Dog extends Animal {
	
	public Dog() {
		super("Dog");
	}

	@Override
	public String getSound() {
		return "bark";
	}

}