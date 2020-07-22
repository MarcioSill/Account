package application;


import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scr = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = scr.nextInt();
			System.out.print("Holder: ");
			scr.nextLine();
			String holder = scr.nextLine();
			System.out.print("Initial balance: ");
			double balance = scr.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = scr.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = scr.nextDouble();
			 
			account.withdraw(amount);
			
			System.out.println(account);
			
		}		
		
		catch (DomainExceptions a) {
			System.out.println("Withdraw error: " + a.getMessage());
			
		}
		
		catch(Exception e) {
			System.out.println("Invalid date format");
		}
				
		
		scr.close();
	}

}
