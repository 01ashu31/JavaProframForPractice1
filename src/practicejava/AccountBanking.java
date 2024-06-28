package practicejava;

import java.util.Scanner;

public class AccountBanking {
	
	long acc_no;
	String name;
	float amount;
	
	Scanner sc= new Scanner(System.in);
	
	public String insert(long accNo, String n, float amt ) {
		acc_no=accNo;
		name=n;
		amount=amt;
		return null;
	}
	
	void deposit(float amt) {
		amount= amount+amt;
		System.out.println("your deposited amout is"+amt);
		System.out.println("Your total aamout after deposit" + amount);
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("Your amount is insuffecient to withdraw");
		}
		else {
			amount= amount-amt;
			System.out.println("After withdraw your remaining amount is" + amount);
		}}
	void checkBalance() {
		System.out.println("Your current balance is " + amount);
	}
	
	void dispaly() {
		System.out.println("your account information is displaying " + acc_no +"  " + name +"  " + amount);
	}

	public static void main(String[] args) {
		try {
		System.out.println("Please enter account number name and amout");
		Scanner sc= new Scanner(System.in);
		long accno=sc.nextInt();
		String name=sc.next();
		Integer amount=sc.nextInt();
		Integer amt=sc.nextInt();
		AccountBanking accont= new AccountBanking();
		accont.insert(accno, name, amount);
		accont.dispaly();
		accont.checkBalance();
		accont.deposit(amt);
		accont.checkBalance();
		accont.withdraw(amt);
		accont.checkBalance();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
