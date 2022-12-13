package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
	
		String aula1 = "Conehcendo mais de listas";
		String aula2 = "modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		/**
		 * Criando a ArrayList e adicionando 3 aulas diferentes
		 */
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas); // faz um print de todos os itens do array
		
		System.out.println("---------------------------------------------------------");
		
		aulas.remove(aula1);
		
		System.out.println(aulas); // print depois de remover uma das aulas
		
		System.out.println("---------------------------------------------------------");
		
		for (String aula : aulas) { // para cada aula dentro da arrayList aulas eu executo este bloco 
			System.out.println(aula);
		}
		
		System.out.println("---------------------------------------------------------");
		
		String primeiraaula = aulas.get(0); // pego o index 0 dentro da minha array
		System.out.println(primeiraaula);
		
		System.out.println("---------------------------------------------------------");
		
		for (int i = 0; i < aulas.size(); i++) { // segue a mesma logica de forech porem utilizamos um for comum 
			System.out.println(aulas.get(i));
		}
		
		System.out.println("---------------------------------------------------------");
		
		aulas.forEach(aula -> {System.out.println(aula);}); // para cada aula eu executo a action seguinte;
		
		System.out.println("---------------------------------------------------------");
	
		aulas.add("Aumnetando o conhecimento");
		System.out.println(aulas);
		System.out.println("depois de ordenar");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		aulas.sort(null);
		
	}
}
