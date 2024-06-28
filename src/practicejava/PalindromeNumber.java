package practicejava;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean isPalindrome(Integer number) {
	    int reverse = 0;
	    Integer originalNumber = number;
	    while (number > 0) {
	        int lastDigit = number % 10;
	        reverse = (reverse * 10) + lastDigit;

	        number = number / 10;
	    }
	    return originalNumber == reverse;
	}
	
	public static void main(String[] args) throws Exception {
		try {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        int input= Integer.parseInt( scanner.nextLine());
        //checking whether palindrome or not
        if(isPalindrome(input))
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
		}catch(Exception e) {
        	//throw new Exception();
        	e.printStackTrace();
        }
    }
}
