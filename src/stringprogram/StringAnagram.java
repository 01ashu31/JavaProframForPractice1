package stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string ");
		String str= sc.nextLine();
		
		System.out.println("Enter the second String");
		String str1=sc.nextLine();
		
		boolean result= arrAnagram(str, str1);
		
		if (result) {
			System.out.println("String are anagrams");
		}else System.out.println("String are not equals");
		

	}

	private static boolean arrAnagram(String str, String str1) {
		if (str.length() != str1.length()) {
			return false;
		}
		char[] charArray1= str.toCharArray();
		char[] charArray2= str1.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}

}
