package TestandoJavaUntil.ArrayList;

import java.util.ArrayList;

import CriandoArraysPorClasses.Conta;
import CriandoArraysPorClasses.ContaCorrente;
import CriandoArraysPorClasses.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta c1 = new ContaCorrente(20,15);
		Conta c2 = new ContaPoupanca(30,12);

		lista.add(c1); // posição na array 0
		lista.add(c2);
		
		Conta ref1 = (Conta) lista.get(0); // para poder utilizar os metodos é necessario usar um Cast.
		
		ref1.setSaldo(10);
		System.out.println(ref1.getSaldo());
		System.out.println(lista.get(0));
		
		System.out.println(lista.get(1).getSaldo());
		System.out.println(lista.get(1));
		System.out.println(lista.size());

	}
}
