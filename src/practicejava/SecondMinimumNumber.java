package practicejava;

import java.util.Scanner;

public class SecondMinimumNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please eneter the number of element");
		
		int num= sc.nextInt();
		
		if (num <2) {
			System.out.println("Please enter atleast 2 number");
			return;
		}
		
		int [] arr= new int[num];
		
		System.out.println("Enter the number that what want to print second minimum nuner");
		
		for (int i=0; i<num ;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The second minimum number is:" + secondMinimum(arr));
		
		sc.close();

	}

	private static int secondMinimum(int[] number) {
		int firstMinvalue= Integer.MAX_VALUE;
		int secondMinValue= Integer.MAX_VALUE;
		
		for (int num : number) {
			if (num < firstMinvalue) {
				secondMinValue =firstMinvalue;
				firstMinvalue=num;
			}
			else if (num < secondMinValue && num != secondMinValue) {
				secondMinValue=num;
			}
		}
			
		return secondMinValue;
	}

}
