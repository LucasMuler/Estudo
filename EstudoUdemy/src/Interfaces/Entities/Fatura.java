package Interfaces.Entities;

public class Fatura {

	private double PagamentoBasico;
	private double taixa;
	private double total;

	public Fatura() {
	}

	public Fatura(double pagamentoBasico, double taixa) {
		PagamentoBasico = pagamentoBasico;
		this.taixa = taixa;
		
		total = pagamentoBasico + taixa;
	}

	public double getPagamentoBasico() {
		return PagamentoBasico;
	}

	public void setPagamentoBasico(double pagamentoBasico) {
		PagamentoBasico = pagamentoBasico;
	}

	public double getTaixa() {
		return taixa;
	}

	public void setTaixa(double taixa) {
		this.taixa = taixa;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "fatura [PagamentoBasico=" + PagamentoBasico + ", taixa=" + taixa + ", total=" + total + "]";
	}
	
}
