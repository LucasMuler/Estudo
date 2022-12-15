package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cursos {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Cursos(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		aulas.add(aula);
	}
	
}
