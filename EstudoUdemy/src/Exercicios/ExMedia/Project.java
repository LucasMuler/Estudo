package Exercicios.ExMedia;

import java.util.Scanner;

import Exercicios.ExMedia.Entities.Aluno;

public class Project {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("nota 1 = ");
		int n1 = sc.nextInt();
		System.out.println("nota 2 = ");
		int n2 = sc.nextInt();
		System.out.println("nota 3 = ");
		int n3 = sc.nextInt();
		
		
		Aluno a1 = new Aluno(nome, n1, n2, n3);
		
		a1.getAprovacao();
		
		sc.close();
		
	}
}
