package br.com.NomeEmpresa.NomeProjeto;

import br.com.NomeEmpresa.NomeProjeto.ClassesComuns.*;
import br.com.NomeEmpresa.NomeProjeto.Pagamento.*;

/**
 * 
 * Sistema que é utilizado para criação de novos clientes e seus pedidos dentro
 * do cinema
 * 
 * @author miill
 *
 */

public class sistemaInterno {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(false);
		Ingresso i1 = new Ingresso(c1);
		i1.setingresso3D();
		i1.getValor();
		Pagamento p1 = new Pagamento(i1, "Debito");

		// -------------------------------------------

	}

}
