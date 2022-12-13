package br.com.alura.java.io.teste.SerializaçãoComHerança;


public class ContaCorrente extends Conta{
	
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
		
	}
	
	
	
	public void saca(double valor) {
		double valorComTaixa = valor + 0.20;
		super.saca(valorComTaixa);
	}
	
	
	public String toString() {
		return super.toString() + "Conta Corrente";
	}
	
}
