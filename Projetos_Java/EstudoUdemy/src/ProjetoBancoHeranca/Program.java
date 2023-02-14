package ProjetoBancoHeranca;

import java.util.Locale;

import ProjetoBancoHeranca.Entities.BusinesAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BusinesAccount account = new BusinesAccount(10, "Lucas", 2000.00, 5000.00);
		
		account.loan(1000.00);
		
		System.out.println(account.getBalance());
		
	}
}
