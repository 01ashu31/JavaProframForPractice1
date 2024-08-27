package stringprogram;

import java.util.Scanner;

public class Removeduplicatestring {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();

	        String result = removeDuplicates(input);
	        System.out.println("String after removing duplicates: " + result);

	        scanner.close();

	}
	public static String removeDuplicates(String str) {
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char currentChar= str.charAt(i);
			
			if(result.indexOf(String.valueOf(currentChar))== -1) {
				result.append(currentChar);
			}
		}
		
		return result.toString();
	}

}



//public static void printUniqueCharacters(String str) {
//	// Assume ASCII characters (0-127), use boolean array to track
//	character occurrences
//	boolean[] unique = new boolean[128];
//	for (int i = 0; i < str.length(); i++) {
//	char ch = str.charAt(i);
//	if (!unique[ch]) {
//	unique[ch] = true;
//	System.out.print(ch + " ");
//	}
//	}
//	}
