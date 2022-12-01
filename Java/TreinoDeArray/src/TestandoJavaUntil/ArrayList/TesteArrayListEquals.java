package TestandoJavaUntil.ArrayList;

import java.util.ArrayList;

import CriandoArraysPorClasses.Conta;
import CriandoArraysPorClasses.ContaCorrente;
import CriandoArraysPorClasses.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta c1 = new ContaCorrente(12,30);
		lista.add(c1); // posição na array 0
		
		Conta c2 = new ContaPoupanca(20,20);
		lista.add(c2);
		Conta c3 = new ContaPoupanca(20,20);

		lista.get(0).setSaldo(500.652);
		
		System.out.println("existe o C2? " + lista.equals(c3));
		
//		System.out.println(lista.get(0).getSaldo());
//		System.out.println(lista.get(0));
//
//		System.out.println(lista.get(1).getSaldo());
//		System.out.println(lista.get(1));
		System.out.println(lista.size());

	}
}
