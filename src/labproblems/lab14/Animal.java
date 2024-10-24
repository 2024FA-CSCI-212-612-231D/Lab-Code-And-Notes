package labproblems.lab14;

public abstract class Animal {
	
	private String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract String getSound();

}