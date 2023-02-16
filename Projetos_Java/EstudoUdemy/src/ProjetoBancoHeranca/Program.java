package ProjetoBancoHeranca;

import java.util.Locale;

import ProjetoBancoHeranca.Entities.Account;
import ProjetoBancoHeranca.Entities.BusinesAccount;
import ProjetoBancoHeranca.Entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
	
		Account x = new Account(1020,"Alex",1000.0);
		Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		
		x.witdraw(50.0);
		y.witdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
	
}
