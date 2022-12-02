package TestandoJavaUntil.ArrayList;

import java.util.ArrayList;

import TesteDeArrayComContas.Conta;
import TesteDeArrayComContas.ContaCorrente;
import TesteDeArrayComContas.ContaPoupanca;

public class TestandoEqualseContains {

	public static void main(String[] args) {
		
//		ArrayList<Integer> lista = new ArrayList<Integer>();
//		
//		int a = 2;
//		lista.add(a);
//		int b = 2;
//		lista.add(b);
//		
//		
//		boolean ref = lista.get(0).equals(lista.get(1));
//	
//		System.out.println(ref);
		
//		ArrayList<String> lista = new ArrayList<String>();
//		
//		String s1 = "Lucas";
//		lista.add(s1);
//		String s2 = "Lucas";
//		lista.add(s2);
//		
//		boolean ref = lista.get(0).equals(lista.get(1));
//		System.out.println(ref);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setSaldo(10);
		lista.add(c1);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setSaldo(10);
		lista.add(c2);
		
		boolean ref = c1.equals(c2);
		System.out.println(ref);
	}
	
}
