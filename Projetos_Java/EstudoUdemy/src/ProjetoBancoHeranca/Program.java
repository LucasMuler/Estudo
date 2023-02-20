package ProjetoBancoHeranca;

import ProjetoBancoHeranca.Entities.Account;
import ProjetoBancoHeranca.Entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
	
		Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		
		y.witdraw(50.0);
		
		System.out.println(y.getBalance());
	}
	
}
