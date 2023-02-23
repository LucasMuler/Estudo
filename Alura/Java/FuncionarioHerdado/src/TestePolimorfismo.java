
public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario primeiroGerente = new Gerente();
		primeiroGerente.setSalario(2000.00);
		Funcionario primeiroFuncionario = new Gerente();
		primeiroFuncionario.setSalario(2000.00);
		
		ControleBonificacao f1 = new ControleBonificacao();
		ControleBonificacao f2 = new ControleBonificacao();
		
		f1.registra(primeiroGerente);
		f2.registra(primeiroFuncionario);
		

	}

}
