package br.com.alura.java.io.teste.SerializaçãoComHerança;

import java.io.Serializable;

public class Cliente implements Serializable{

	private int idade;
	private String CPF;
	private String nome;
	private String profissao;
	
	
	// metodos
	
	
	
	// get e set
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	public String toString() {
		return "eu sou um objeto do tipo cliente: " + super.toString();
	}
	
}
