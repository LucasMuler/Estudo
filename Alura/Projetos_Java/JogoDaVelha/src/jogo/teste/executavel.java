package jogo.teste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class executavel {
	public static void main(String[] args) {
		
//		System.out.println("Gostaria de Jogar um jogo da velha?");
//		System.out.println("digite 'sim' ou 'nao'");
		Scanner sc = new Scanner(System.in);
		List<>
		
		System.out.println("---------");

		
//		if (sc.next().compareTo("sim") == 0) {
//			System.out.println("Vamos jogar então");
			Partida p = new Partida();
			
			p.constoiTabuleiro();
			p.perguntaposicao();
			
			
//		} else {
//			System.out.println("Ok tenha um bom dia");
//		}
		
		
		

		sc.close();
	}
}

class Partida{
	
	private int posicaoColuna;
	private int posicaoLinha;
	
	public void constoiTabuleiro() {
		System.out.println("|  | 1 | 2 | 3 |");
		System.out.println("-------------");
		System.out.println("| 1 |  |  |  |");
		System.out.println("-------------");
		System.out.println("| 2 |  |  |  |");
		System.out.println("-------------");
		System.out.println("| 3 |  |  |  |");
		System.out.println("-------------");
	}

	public void perguntaposicao() {
		
	Scanner s = new Scanner (System.in);
	
	System.out.println("escolha de 1 a 3 para a posição da coluna");
	s.hasNextInt();
	
	while(s.hasNextInt()) {}
	
	
	}

}

