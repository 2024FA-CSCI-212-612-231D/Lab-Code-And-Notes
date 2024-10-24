package labsolutions.lab14;

public class Chick extends Animal {
	
	public Chick() {
		super("Chick");
	}

	@Override
	public String getSound() {
		if(Math.random() < 0.5) {
			return "Chirp";
		}
		return "Cheep";
	}

}