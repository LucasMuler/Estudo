
public class Pagamento{

	private Ingresso ingresso;
	
	public Pagamento(Ingresso ingresso, String tipo) {
		this.ingresso = ingresso;
		if (tipo == "Debito") {
			new Debito(ingresso, tipo);
		} else if(tipo == "Credito") {
			
		} else {
			
		}
	}

	public double getIngresso() {
		return ingresso.getValor();
	}
	
}
