package stringprogram;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String str) {
		char ch[] = str.toCharArray(); // to convert string to the character array
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}

		return rev;

//		char[] ch = str.toCharArray();
//		char[] rev = new char[ch.length];
//		for (int i = 0; i < ch.length; i++) {
//			rev[i] = ch[ch.length - 1 - i]; // This creates a new character array with the same length as the ch array.
//											// Initially, this array is filled with default values (null characters).
//		}
//		return new String(rev);
		
//	***************************************************************************************
//	char[] ch = str.toCharArray();
//	StringBuilder rev = new StringBuilder(); // StringBuilder is a mutable sequence of characters,
//	for (int i = ch.length - 1; i >= 0; i--) {
//	    rev.append(ch[i]);
//	}
//	return rev.toString();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string  for the reverse");
		String input = sc.nextLine();
		System.out.println(reverseString(input));

	}

}
