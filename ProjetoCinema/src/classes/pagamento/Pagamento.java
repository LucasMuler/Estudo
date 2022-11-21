package classes.pagamento;

public class Pagamento{

	// este nome é chamado FQN que significa que este é o caminho de diretorio inteiro 
	
	private classes.Ingresso ingresso;
	
	public Pagamento(classes.Ingresso ingresso, String tipo) {
		this.ingresso = ingresso;
		if (tipo == "Debito") {
			new Debito(ingresso, null);
		} else if(tipo == "Credito") {
			
		} else {
			
		}
	}

	public double getIngresso() {
		return ingresso.getValor();
	}
	
}
