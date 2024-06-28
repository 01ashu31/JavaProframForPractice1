package practicejava;

import java.util.Scanner;

public class PrimeNumber {

	public String prime(Integer num) {
		
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number");
				break;
			} else {
				System.out.println(num + " is prime number");
				break;
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Enter any number to check prime number");
			Scanner sc = new Scanner(System.in);
			Integer number= sc.nextInt();
			PrimeNumber primeNumber = new PrimeNumber();
			String prime = primeNumber.prime(number);
			System.out.println(prime);
		} catch (Exception e) {
			throw new Exception();
		}

	}
}
