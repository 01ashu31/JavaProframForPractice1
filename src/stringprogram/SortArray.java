package stringprogram;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of element");
		int n= sc.nextInt();
		
		
		int[] array= new int[n];
		System.out.println("Enter the element");
		
		for(int i=0;i<n; i++) {
			array[i]=sc.nextInt();
			
		}
		
		System.out.println("Original array: ");
		
		printArray(array);
		
		bubbleSort(array);
		
		System.out.println("Sorted Array: ");
		
		printArray(array);
		
		sc.close();

	}

	private static void bubbleSort(int[] array) {
		int n= array.length;
		boolean swapped;
		
		for(int i=0;i<n-1;i++) {
			swapped =false;
			
			for(int j=0;j<n-2;j++) {
				if(array[j] > array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
				swapped= true;
			}}
			if(!swapped) 
				break;
			
		}}
		

	private static void printArray(int[] array) {
		for(int i : array) {
			System.out.println(i + " ");
		}
		System.out.println();
		
	}

}
