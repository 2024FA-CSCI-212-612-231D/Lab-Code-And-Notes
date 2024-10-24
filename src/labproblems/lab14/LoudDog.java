package labproblems.lab14;

public class LoudDog extends Dog {
	
	@Override
	public String getSound() {
		return super.getSound().toUpperCase();
	}

}