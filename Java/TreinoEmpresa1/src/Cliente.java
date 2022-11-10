
public class Cliente implements Autentica{

	private AutenticaUnitario autenticavel;


	public Cliente() {
		this.autenticavel = new AutenticaUnitario();
	}

	public void setsenha(int senha) {
		this.autenticavel.setsenha(senha);
	}
	
	public boolean autentica(int senha) {
		boolean autentica = this.autenticavel.autentica(senha);
		return autentica;
	}

}
