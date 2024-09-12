package labsolutions.lab3;

public class Lab3CodingBatStringEasy1 {

	public static String helloName(String name) {
		  return "Hello " + name + "!";
	}
	
	public static void main(String[] args) {
		String person = "Aleks";
		
		String response = helloName(person);
		
		System.out.print(response);
	}

}
