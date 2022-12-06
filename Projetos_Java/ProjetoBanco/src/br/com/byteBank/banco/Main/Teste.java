package br.com.byteBank.banco.Main;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.byteBank.banco.Cliente.Cliente;
import br.com.byteBank.banco.Conta.Conta;
import br.com.byteBank.banco.Conta.ContaCorrente;
import br.com.byteBank.banco.Conta.ContaPoupanca;
import br.com.byteBank.banco.Excption.MinhaExption;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> listaDeConta = new ArrayList<Conta>();
		
		Cliente cliente1 = new Cliente("Lucas", "222.222.222-22");
		Conta conta1 = new ContaCorrente(3040, 02, cliente1);
		listaDeConta.add(conta1);
		
		Cliente cliente2 = new Cliente ("Amanda", "111.111.111-11");
		Conta conta2 = new ContaPoupanca(6845, 01, cliente2);	
		listaDeConta.add(conta2);
		
		
		Cliente cliente3 = new Cliente ("Guilherme", "333.333.333-33");
		Conta conta3 = new ContaPoupanca(9478, 01, cliente3);	
		listaDeConta.add(conta3);
		
		Cliente cliente4 = new Cliente ("Ronaldo", "444.444.444-44");
		Conta conta4 = new ContaPoupanca(2648, 01, cliente4);	
		listaDeConta.add(conta4);
		
//		try {
//
//			cc1.deposita(200);
//			cc1.transfere(cp1, 30);
//			cc1.saca(1);
//			
//		} catch (MinhaExption ex) {
//			System.out.println("nao foi possivel concluir o processo");
//		}
//		
//		System.out.println(cc1.getSaldo());
		
		System.out.println(listaDeConta.size());
		
		for (Conta conta : listaDeConta) {
			System.out.println(conta);
		}
		
		comparadorDeContaNumeroCrescente c = new comparadorDeContaNumeroCrescente();
		listaDeConta.sort(c);
		
		System.out.println("--------------------");
		
		for (Conta conta : listaDeConta) {
			System.out.println(conta);
		}
		
	}

}

class comparadorDeContaNumeroCrescente implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		
		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		return 0;
	}
	
}
