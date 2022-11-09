
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getbonificacao() {
		return super.getSalario() + 65;
	}

}
