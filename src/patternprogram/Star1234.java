package patternprogram;

import java.util.Scanner;

public class Star1234 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value till row you want to print");
		int input = sc.nextInt();
		
		Pattern printpatter= new Pattern();
		printpatter.printpattern(input);
		

	}

	public static class Pattern {

		public void printpattern(int input) {

			for (int i = 1; i <= input; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
		}

	}

}
