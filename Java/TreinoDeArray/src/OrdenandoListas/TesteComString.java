package OrdenandoListas;

import java.util.ArrayList;
import java.util.Comparator;

import TesteDeArrayComContas.Cliente;
import TesteDeArrayComContas.Conta;
import TesteDeArrayComContas.ContaCorrente;
import TesteDeArrayComContas.ContaPoupanca;

public class TesteComString {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente c1 = new Cliente();
		Conta cc1 = new ContaCorrente(24, 11, c1);
		lista.add(cc1);
		c1.setNome("Ana");
		cc1.deposita(111.0);
		
		Cliente c2 = new Cliente();
		Conta cc2 = new ContaPoupanca(23, 11, c2);
		lista.add(cc2);
		c2.setNome("Nico");
		cc1.deposita(111.0);
		
		Cliente c3 = new Cliente();
		Conta cc3 = new ContaCorrente(22, 11, c3);
		lista.add(cc3);
		c3.setNome("Guilherme");
		cc1.deposita(111.0);
		
		Cliente c4 = new Cliente();
		Conta cc4 = new ContaPoupanca(21, 11, c4);
		lista.add(cc4);
		c4.setNome("Paulo");
		cc1.deposita(111.0);

		
		for (Conta conta : lista) {
			System.out.println(conta + " Titular: " + conta.getTitular().getNome());
		}
		
		NumeroDaContaComparator comparator1 = new NumeroDaContaComparator();
		TitularDaContaComparator comparator2 = new TitularDaContaComparator();
		lista.sort(comparator2);
		
		System.out.println("-----------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta + " Titular: " + conta.getTitular().getNome());
		}
		
	}

}

class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		String titularc1 = c1.getTitular().getNome();
		String titularc2 = c2.getTitular().getNome();
		return titularc1.compareTo(titularc2);
		}
	}


class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if (c1.getNumero() > c2.getNumero()) {
			return +1;
		}
		
		return 0;
	}
	
}
