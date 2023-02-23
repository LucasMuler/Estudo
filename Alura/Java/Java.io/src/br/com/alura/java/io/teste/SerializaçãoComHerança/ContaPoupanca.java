package br.com.alura.java.io.teste.SerializaçãoComHerança;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	
	}
	

	public void saca(double valor) {
		double valorComTaixa = valor + 0.5;
		super.saca(valorComTaixa);
	}
	
}
