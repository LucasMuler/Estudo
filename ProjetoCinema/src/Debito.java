
public class Debito extends Pagamento{

	private double saldo;
	
	public Debito(Ingresso ingresso, String tipo) {
		super(ingresso, tipo);
	}
	
	public void inicia() {
		System.out.println("Pode Inserir o cartão e utilizar o pad para colocar a senha");
		if (saldo >= super.getIngresso()) {
			System.out.println("Compra efetuada");
		} else {
			System.out.println("valor insuficiente");
		}
	}
	
	public double getsaldo() {
		return this.saldo;
	}
	
	public void setsaldo(double valor) {
		this.saldo = valor;
	}
	
}
