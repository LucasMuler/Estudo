
public class Designer extends Funcionario {

	@Override
	public double getbonificacao() {
		double bonificacao = super.getSaldo() + 50;
		return bonificacao;
	}

}
