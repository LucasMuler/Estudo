package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("A Revistando as ArryLists", 2);
		Aula a2 = new Aula("C Listas de objetos", 1);
		Aula a3 = new Aula("B Relacionamento de listas e objetos", 3);
		
		ArrayList<Aula> listDeAulas = new ArrayList<Aula>();
		listDeAulas.add(a1);
		listDeAulas.add(a2);
		listDeAulas.add(a3);
		
		System.out.println(listDeAulas);

		listDeAulas.sort(Comparator.comparing(Aula::getTitulo));
		
		System.out.println(listDeAulas);
		
		listDeAulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(listDeAulas);
		
	}
}

