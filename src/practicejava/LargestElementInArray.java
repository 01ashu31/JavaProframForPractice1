package practicejava;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		 // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
     // Create an array to hold the elements
        int[] array = new int[n];
		
     // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Find the largest element in the array
        int largest = largestElement(array);

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
        
        sc.close();

	}
	
	
	public static int largestElement(int[] n) {
		
		int largest= n[0];
		for (int i=1; i<n.length;i++) {
			if (n[i] > largest) {
				largest= n[i];
			}
			
		}
		return largest;
	}

}
