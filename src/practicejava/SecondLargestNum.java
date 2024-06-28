package practicejava;

import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number fo element");
		int n= sc.nextInt();
		
		if (n<2) {
			System.out.println("Array should have atleast two number");
			return;
		}
		
		int[] arr= new int[n];
		
		System.out.println("Enter the number from there you want to find second largest number");
		
		for(int i= 0 ;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int secondlargest= secondlargest(arr);
		System.out.println("The second largest number is: " + secondlargest);
		
		sc.close();

	}

	private static int secondlargest(int[] num) {
		int firstlarhest=Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		
		for(int number : num){
			if(number > firstlarhest) {
				secondLargest=firstlarhest;
				firstlarhest=number;
			}
			else if (number > secondLargest && number != firstlarhest) {
				secondLargest=number;
			}
		}
		return secondLargest;
	}
	
	

}
