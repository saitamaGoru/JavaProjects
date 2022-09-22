package wk2session2ex3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Mark Queen",-7.53);
		
		System.out.printf("%s balance: %.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: %.2f%n",account2.getName(),account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the deposit amount for account1:");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
		
		double withdrawlAmount;
		System.out.print("Enter the withdrawl amount for account2:");
		withdrawlAmount = input.nextDouble();
		account2.withdraw(withdrawlAmount);
		System.out.printf("%s balance: $%.2f%n%n",account2.getName(),account2.getBalance());
		
	}

}
