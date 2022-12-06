package OrdenandoListas;

import java.util.ArrayList;
import java.util.Comparator;

import TesteDeArrayComContas.Conta;
import TesteDeArrayComContas.ContaCorrente;
import TesteDeArrayComContas.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(33, 22);
		c1.deposita(333.0);
		
		Conta c2 = new ContaPoupanca(44, 22);
		c2.deposita(444.0);
		
		Conta c3 = new ContaCorrente(11, 22);
		c3.deposita(111.0);
		
		Conta c4 = new ContaPoupanca(22, 22);
		c4.deposita(222.0);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		System.out.println("----------------------------");
		
		
		NumeroDaContaCoparator c = new NumeroDaContaCoparator();
		lista.sort(c);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}

}

class NumeroDaContaCoparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {

		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}

		return 0;
		
	}
	
}
