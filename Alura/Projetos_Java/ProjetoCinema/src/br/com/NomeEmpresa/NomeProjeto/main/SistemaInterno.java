package br.com.NomeEmpresa.NomeProjeto.main;

import br.com.NomeEmpresa.NomeProjeto.Cliente.Cliente;

public class SistemaInterno extends Cliente {

	public SistemaInterno(boolean passeDeEstudante, int numeroTipoIngresso, int numeroTipoPagamento) {
		super(passeDeEstudante, numeroTipoIngresso, numeroTipoPagamento);

		/**
		 *  
		 * Esta parte do codigo é responsavel por trabalhar com o tipo de ingresso e
		 * retornar o valor certo ao cliente
		 * 
		 */

		if (super.getTipoIngresso() == "Normal") {
			super.getIngresso().setValorNormal();
		} else if (super.getTipoIngresso() == "3D") {
			super.getIngresso().setValor3D();
		} else {
			super.getIngresso().setValorNamoradeira();
		}

		if (passeDeEstudante == true) {
			System.out.println("O valor ficou: " + super.getIngresso().getValor() / 2);
		} else
			System.out.println("O valor ficou: " + super.getIngresso().getValor());

		System.out.println("qual seria a forma de pagamento ?");
		
		
		
	}

}
