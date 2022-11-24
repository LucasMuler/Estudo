package br.com.NomeEmpresa.NomeProjeto.Cliente;

import br.com.NomeEmpresa.NomeProjeto.Ingresso.Ingresso;
import br.com.NomeEmpresa.NomeProjeto.Pagamento.Pagamento;

public class Cliente {

	private boolean PasseDeEstudante;
	private String tipoIngresso;
	private double saldo;
	
	private Ingresso ingresso;
	private Pagamento pagamento;

	public String[] listaIngressos = { "Normal", "3D", "Namoradeira" };

	/**
	 * 
	 * Construtor que define qual o tipo de ingresso e se o cliente tem passe se
	 * estudante ou não, no contrutor colocamos a informação de true caso seja
	 * estudade e false caso contrario, já o segundo valor é uma lista que pode
	 * variar de 0 a 3 sendo: 0(Normal), 1(3D) e 2(Namoradeira)
	 * 
	 * @param passeDeEstudante
	 * @param numeroTipoIngresso
	 */

	public Cliente(boolean passeDeEstudante, int numeroTipoIngresso, int numeroTipoPagamento) {
		ingresso = new Ingresso();
		pagamento = new Pagamento(numeroTipoPagamento, this.saldo);

		this.PasseDeEstudante = passeDeEstudante;
		tipoIngresso = listaIngressos[numeroTipoIngresso];
	}

	/**
	 * 
	 * Geters e seters
	 * 
	 * @return
	 */

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

	public boolean isPasseDeEstudante() {
		return PasseDeEstudante;
	}

	public void setPasseDeEstudante(boolean passeDeEstudante) {
		PasseDeEstudante = passeDeEstudante;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


}
