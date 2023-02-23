package Exercicios.ExMedia.Entities;

public class Aluno {
	
	private String nome;
	private int nota1;
	private int nota2;
	private int nota3;
	private int total;

	public Aluno(String nome ,int n1, int n2, int n3) {
		this.nome = nome;
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		total = nota1 + nota2 + nota3;
	}
	
	public void getAprovacao() {
		if (total >= 60) {
			System.out.println("Final Grade = " + total);
			System.out.println("Pass");
		} else {
			System.out.println("Final Grade = " + total);
			System.out.println("Failed");
			System.out.println("Missing " + (60 - total) + " Points");
		}
	}
}
