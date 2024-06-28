package practicejava;

import java.util.Scanner;

public class SeriesType {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms in the series: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Invalid input! Please provide at least two terms.");
            System.exit(0);
        }

        System.out.print("Enter the first term of the series: ");
        int firstTerm = input.nextInt();

        System.out.print("Enter the second term of the series: ");
        int secondTerm = input.nextInt();

        int thirdTerm = input.nextInt();
        int diff1 = secondTerm - firstTerm;
        int diff2 = thirdTerm - secondTerm;
        double ratio = (double) secondTerm / firstTerm;

        // Checking if the series is Arithmetic Progression
        if (diff1 == diff2) {
            int nextTerm = secondTerm + diff1;
            System.out.println("The given series is an Arithmetic Progression and the next term is " + nextTerm);
        }

        // Checking if the series is Geometric Progression
        else if ((double) diff2 / diff1 == ratio) {
            int nextTerm = (int) (secondTerm * ratio);
            System.out.println("The given series is a Geometric Progression and the next term is " + nextTerm);
        }

        // Checking if the series is Fibonacci Series
        else if (thirdTerm == firstTerm + secondTerm) {
            int f1 = secondTerm, f2 = thirdTerm, f3;
            for (int i = 4; i <= n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println("The given series is a Fibonacci Series and the next term is " + f2);
        }

        // If the series is none of the above types
        else {
            System.out.println("The given series is not an Arithmetic, Geometric or Fibonacci Series. Result is -999.");
        }
    }
}



