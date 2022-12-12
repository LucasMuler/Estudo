package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 112651661321351L;
	
	
	private String CPF;
	private String nome;
	private String profissao;
	
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
	
}
