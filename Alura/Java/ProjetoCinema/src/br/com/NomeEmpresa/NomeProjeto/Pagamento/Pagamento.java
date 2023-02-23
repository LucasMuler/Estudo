package br.com.NomeEmpresa.NomeProjeto.Pagamento;

import br.com.NomeEmpresa.NomeProjeto.ClassesComuns.Ingresso;

/**
 * 
 * Tratamento de todas as formas de pagamento e suas logicas separadas
 * 
 * @author miill
 *
 */

public class Pagamento {

	private Ingresso ingresso;

	/**
	 * 
	 * contrutor que necessita que seja associado um ingresso para que possa pegar o
	 * valor, e necessita que seja digitado uma String de qual modalidade de
	 * pagamento será utilziada podendo variar entre "Debito", "Credito" e
	 * "Dinheiro"
	 * 
	 * @param ingresso
	 * @param tipo
	 */

	public Pagamento(Ingresso ingresso, String tipo) {
		this.ingresso = ingresso;
		if (tipo == "Debito") {
			Debito d1 = new Debito(ingresso, null);
			d1.inicia();
		} else if (tipo == "Credito") {

		} else {

		}
	}

	public double getIngresso() {
		return ingresso.getValor();
	}

}
