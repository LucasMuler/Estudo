package br.com.nomeEmpresa.nomeProjeto;

import br.com.NomeEmpresa.NomeProjeto.ClassesComuns.Cliente;
import br.com.NomeEmpresa.NomeProjeto.ClassesComuns.Ingresso;
import br.com.NomeEmpresa.NomeProjeto.Pagamento.Pagamento;

public class Teste {
	public static void main(String[] args) {

		Cliente c1 = new Cliente(false);
		Ingresso i1 = new Ingresso(c1);
		i1.setingresso3D();
		i1.getValor();
		Pagamento p1 = new Pagamento(i1, "Debito");

	}
}
