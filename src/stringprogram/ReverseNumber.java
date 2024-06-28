package stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=sc.nextInt();
		
		int[] inputarr= new int[n];
		
		System.out.println("Enter the element of array");
		for (int i=0; i<n;i++) {
			inputarr[i]=sc.nextInt();
		}
		System.out.println("original Array: " + Arrays.toString(inputarr));
		revNumber(inputarr);
		System.out.println("reverse String:" + Arrays.toString(inputarr));

	}

	private static void revNumber(int[] num) {
		
		int start=0;
		int end= num.length-1;
		
		while (start < end) {
			int tem= num[start];
			num[start]=num[end];
			num[end]=tem;
			
			start++;
			end--;
		}
		
		
	}

}
