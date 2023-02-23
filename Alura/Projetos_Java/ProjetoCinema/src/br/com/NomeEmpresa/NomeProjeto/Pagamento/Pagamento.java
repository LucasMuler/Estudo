package br.com.NomeEmpresa.NomeProjeto.Pagamento;

import br.com.NomeEmpresa.NomeProjeto.Ingresso.Ingresso;

public class Pagamento extends Ingresso {

	private String pagamento;
	private double saldo;
	private double resultado;

	String[] formasDePagamento = { "Debito", "Credito", "Dinheiro" };

	public Pagamento(int numeroTipoPagamento, double saldo) {

		pagamento = formasDePagamento[numeroTipoPagamento];
		this.saldo = saldo;

		if (pagamento == "Debito") {
			if (saldo >= super.getValor()) {
				System.out.println("Compra efetuada com sucesso");
			} else {
				System.out.println("compra negada, saldo insuficiente");
			}
		} else if (pagamento == "Credito") {
			if (saldo >= super.getValor()) {
				System.out.println("Compra efetuada com sucesso");
			} else {
				System.out.println("compra negada, saldo insuficiente");
			}
		} else {
			System.out.println("oi");
		}

	}

	public void CalculoDinheiro() {
		if (this.saldo >= 5) {
			
		} else if (this.saldo >= 10) {

		} else if (this.saldo >= 10) {

		} else if (this.saldo >= 10) {

		} else if (this.saldo >= 10) {

		}
	}

	public double getresultado() {
		return resultado;
	}

	public String getpagamento() {
		return pagamento;
	}

}
