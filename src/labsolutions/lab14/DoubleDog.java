package labsolutions.lab14;

public class DoubleDog extends Dog {

	public String getSound() {
		return super.getSound() + " " +  super.getSound();
	}

}