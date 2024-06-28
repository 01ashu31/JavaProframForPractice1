package practicejava;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the second number");
		int b= sc.nextInt();
		
		System.out.println("Before swapping number: a " +  a + " B: " + b );
		
//		a= a+b;
//		a= a-b;
//		b=a-b;
		
		int temp= a;
		a= b;
		b= temp;
		
		System.out.println("After swapping number: a " + a + " b: " + b);

	}

}
