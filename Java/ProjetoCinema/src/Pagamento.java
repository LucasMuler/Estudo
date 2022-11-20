
public class Pagamento{

	private Ingresso ingresso;
	
	public Pagamento(Ingresso ingresso, String tipo) {
		this.ingresso = ingresso;
		if (tipo == "Debito") {
			Debito d1 = new Debito(ingresso,null);
			d1.inicia();
		} else if(tipo == "Credito") {
			
		} else {
			
		}
	}

	public double getIngresso() {
		return ingresso.getValor();
	}
	
}
