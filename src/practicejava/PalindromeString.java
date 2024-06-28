package practicejava;

import java.util.Scanner;

public class PalindromeString {
	
	
	public static boolean IsPalindrome( String str) {
		str= str.replaceAll("\\s+", "").toLowerCase();
		
		int left= 0;
		int right = str.length()-1;
		while (left < right) {
			if(str.charAt(left)!= str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string that is need to check palindrome");
		String input= sc.nextLine();
		if (IsPalindrome(input)) {
			System.out.println("This is palindrome string");
		}
		else System.out.println("This is not a palindrome string");

	}

}
