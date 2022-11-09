
public class EditorDeVideo extends Funcionario {

	@Override
	public double getbonificacao() {
		double bonificacao = super.getSaldo() + 30;
		return bonificacao;
	}

}
