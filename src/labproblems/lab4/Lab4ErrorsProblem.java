package labproblems.lab4;

public class Lab4ErrorsProblem{

	/*
	 * Lab Problem: The findSingletons method in the Errors class is intended to return a String 
	 * containing only the letters that appear exactly once in the parameter str. 
	 * It contains three errors (one syntax error, one runtime error, and one semantic error). 
	 * Find and fix all three errors.
	 * 
	 * */
	
	public static void main(String[] args){
		System.out.println(halveString("abracadabra"));
		System.out.println(reverseString("abracadabra"));
		System.out.println(countA("abracadabra"));
		//System.out.println(findSingletons("abracadabra"));
	}

	//contains syntax error
	public static String halveString(String original){
		return original.substring(0, original.lenght() / 2);
	}

	//contains runtime error
	public static String reverseString(String original){
		String reversed = "";
		for (int i = original.length(); i >= 0; i--){
			reversed += original.substring(i, i + 1);
		}
		return reversed;
	}

	//contains semantic error
	public static int countA(String str){
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.substring(i, i + 1) == "a" || str.substring(i, i + 1) == "A"){
				count++;
			}
		}
		return count;
	}
	
	/*
	//contains all three error types
	public static String findSingletons(String str){
		String singletons = "";
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i - 1);
			int count = 0;
			for (int j = 0; j < str.length(); i++){
				if (str.substring(j, j + 1).equalsIgnoreCase(letter)){
					count++;
				}
			}
			if (count == 1){
				singletons += letter;
			}
		}
	}
	*/
}