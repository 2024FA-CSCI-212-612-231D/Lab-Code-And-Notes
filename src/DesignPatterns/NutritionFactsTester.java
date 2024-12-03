package DesignPatterns;

public class NutritionFactsTester {

	public static void main(String[] args) {
		// The chained methods execute on order from Left to Right
		// So Builder is called first with the required fields
		// and then the rest of the optional fields are updated with the setter-like methods 
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
										.calories(100)
										.sodium(35)
										.carbohydrate(27)
										.build(); // finally the build method executes last
												  // which constructs the new Computer instance using
												  // the values that have been set in the Builder class
		System.out.println(cocaCola);
	}

}