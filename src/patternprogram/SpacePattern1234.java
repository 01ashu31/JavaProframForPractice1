package patternprogram;

import java.util.Scanner;

public class SpacePattern1234 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number till you want to print *");
		int input=sc.nextInt();
		
		Program1 program= new Program1();
		program.pattern1(input);

	}
	
	public static class Program1 {
		
		public void pattern1(int num) {
			
			for(int i= 1; i<=num;i++) {
				for(int k=num-1; k>0;k--) {
					System.out.print(" ");
				}
				System.out.println(" ");
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
		
	}
	
	

}
