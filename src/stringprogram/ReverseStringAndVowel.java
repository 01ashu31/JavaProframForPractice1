package stringprogram;

import java.util.Scanner;

public class ReverseStringAndVowel {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Output
	        System.out.println("Original string: " + inputString);
	        System.out.println("Reversed string: " + reverseString(inputString));
	        
	        // Count number of vowels and consonants
	        int[] counts = countVowelsAndConsonants(inputString);
	        System.out.println("Number of vowels: " + counts[0]);
	        System.out.println("Number of consonants: " + counts[1]);
	        
	        // Check for palindrome
	        if (isPalindrome(inputString))
	            System.out.println("The string is a palindrome.");
	        else
	            System.out.println("The string is not a palindrome.");
	        
	        scanner.close();
	    }
	    
	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }
	    
	    // Method to count vowels and consonants
	    public static int[] countVowelsAndConsonants(String str) {
	        int vowels = 0;
	        int consonants = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowels++;
	            } else if (ch >= 'a' && ch <= 'z') {
	                consonants++;
	            }
	        }
	        return new int[]{vowels, consonants};
	    }
	    
	    // Method to check if a string is palindrome
	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase();
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	}


