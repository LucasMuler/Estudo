
public class Cliente implements Autentica{

	
	public void setsenha(int senha) {
		
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
