package practicejava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number of terms in the fibonacci series: ");
		int n= sc.nextInt();
		
		
		int a= 0, b=1;
		
		System.out.println("Fibonacci series: ");
		
		for(int i=0;i<=n;i++) {
			System.out.println(a + " ");
			
			int nextterm= a+b;
			
			a=b;
			b=nextterm;
		}
		sc.close();

	}

}
