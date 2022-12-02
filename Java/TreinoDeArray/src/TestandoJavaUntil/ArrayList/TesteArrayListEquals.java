package TestandoJavaUntil.ArrayList;

import java.util.ArrayList;

import CriandoArraysPorClasses.Conta;
import CriandoArraysPorClasses.ContaCorrente;
import CriandoArraysPorClasses.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente c1 = new ContaCorrente(13,30);
		lista.add(c1); // posição na array 0
		
		ContaPoupanca c2 = new ContaPoupanca(12,30);
		lista.add(c2);
	
		
		ContaPoupanca c3 = new ContaPoupanca(20,20);
		lista.add(c3);

		lista.get(0).setSaldo(500.652);
		
		System.out.println("existe o C2? " + lista.contains(c1));
		
//		System.out.println(lista.get(0).getSaldo());
//		System.out.println(lista.get(0));
//
//		System.out.println(lista.get(1).getSaldo());
//		System.out.println(lista.get(1));
		System.out.println(lista.size());

	}
}
