package br.com.byteBank.banco.Cliente;

public class Cliente {

	/**
	 * Atributos da minha classe
	 */
	
	private String nome;
	private int idade;
	private String profissao;
	private String CPF;
	
	/**
	 * Constructor da minha classe Cliente
	 * @param nome
	 * @param idade
	 * @param profissao
	 * @param CPF
	 */
	
	public Cliente(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	
	
	/**
	 * Geters e seters
	 * @return
	 */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
}
