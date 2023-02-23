package classes.pagamento;
import classes.Ingresso;

public class Debito extends Pagamento{

	private double saldo = 24;
	
	//construtores
	
	public Debito(Ingresso ingresso, String tipo) {
		super(ingresso, tipo);
		inicia();
		// TODO Auto-generated constructor stub
	}
	
	// metodos
	
	public void inicia() {
		System.out.println("Pode Inserir o cartão e utilizar o pad para colocar a senha");
		if (saldo >= super.getIngresso()) {
			System.out.println("Compra efetuada");
		} else {
			System.out.println("valor insuficiente");
		}
	}
	
	// get e seters
	
	public double getsaldo() {
		return this.saldo;
	}
	
	public void setsaldo(double valor) {
		this.saldo = valor;
	}
	
}
