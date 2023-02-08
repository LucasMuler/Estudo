package Exercicios.ExMatriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nLinhas = sc.nextInt();
		int nColunas = sc.nextInt();
		
		int[][] mat = new int[nLinhas][nColunas];
		
		for(int l = 0; l < nLinhas; l++) {
			for(int c = 0; c < nColunas; c++) {
				mat[l][c] = sc.nextInt(); 
			}
		}
		
		int numeroPesquisa = sc.nextInt();
		
		for(int l = 0; l < nLinhas; l++) {
			for(int c = 0; c < nColunas; c++) {
				if (mat[l][c] == numeroPesquisa) {
					System.out.println("Posicao " + l + " ," + c);
			
					try {
						System.out.println("a esqueda do numero escolhido " + mat[l][(c-1)]);
					} catch (Exception e) {
						System.out.println("posicao nao existente");
					}try {
						System.out.println("a direita do numero escolhido " + mat[l][(c+1)]);
					} catch (Exception e) {
						System.out.println("posicao nao existente");
					}try {
						System.out.println("a cima do numero escolhido " + mat[(l-1)][(c)]);
					} catch (Exception e) {
						System.out.println("posicao nao existente");
					}try {
						System.out.println("a baixo do numero escolhido " + mat[(l+1)][(c)]);
					} catch (Exception e) {
						System.out.println("posicao nao existente");
					}
				}
			}
		}
		sc.close();
	}

}
