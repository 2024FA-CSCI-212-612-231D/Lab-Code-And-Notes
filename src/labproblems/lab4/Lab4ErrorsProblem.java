package labproblems.lab4;

public class Lab4ErrorsProblem{

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