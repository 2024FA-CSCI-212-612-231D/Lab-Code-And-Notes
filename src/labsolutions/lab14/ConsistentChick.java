package labsolutions.lab14;

public class ConsistentChick extends Chick{
	
	private String sound;

	public ConsistentChick() {
	    if (super.getSound().equals("Chirp")) {
	    	this.sound = "Chirp";
	    } else {
	    	this.sound = "Cheep"; 
	    }
	}
	
	@Override 
	public String getSound() {
		return this.sound;
	}

}