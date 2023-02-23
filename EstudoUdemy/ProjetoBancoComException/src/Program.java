import java.util.Scanner;

import Entities.Account;
import Exception.EnoughBalanceException;
import Exception.ExceedsWithdrawLimitException;
import Exception.InvalidDepositException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			double inibalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account c = new Account(number,holder,inibalance,withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			sc.nextLine();
			
			c.saque(withdraw);
			
		} catch (ExceedsWithdrawLimitException e) {
			System.out.println("withdraw error: " + e.getMessage());
		} catch (EnoughBalanceException e) {
			System.out.println("withdraw error: " + e.getMessage());
		} catch (InvalidDepositException e) {
			System.out.println("Deposit error: " + e.getMessage());
		}
		
		sc.close();
	}
	
}
