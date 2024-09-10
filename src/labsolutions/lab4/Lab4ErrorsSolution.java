package labsolutions.lab4;

public class Lab4ErrorsSolution{

	public static void main(String[] args){
		System.out.println(halveString("abracadabra"));
		System.out.println(reverseString("abracadabra"));
		System.out.println(countA("abracadabra"));
		System.out.println(findSingletons("abracadabra"));
	}

	//contains syntax error
	public static String halveString(String original){
		return original.substring(0, original.length() / 2); // typo in length 
	}

	//contains runtime error
	public static String reverseString(String original){
		String reversed = "";
		for (int i = original.length() - 1; i >= 0; i--){ // added -1 after length to prevent out of bound indexing
			reversed += original.substring(i, i + 1);
		}
		return reversed;
	}

	//contains semantic error
	public static int countA(String str){
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("A")){ // replaced == with .equals
				count++;
			}
		}
		return count;
	}
	
	public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i + 1); //i + 1 to avoid runtime error
			int count = 0;
			for (int j = 0; j < str.length(); j++){ //j++ to fix semantic error (infinite loop)
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
		return singletons; //added return statement to fix syntax error
	}
	
}