
public class Ingresso {

	private double valorbase = 12;
	private double valor;
	private Cliente cliente;
	
	public Ingresso(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public double getValor() {
		
		if (cliente.getmeia() == true) {
			System.out.print("O valor ficou: " + this.valor / 2);
			return this.valor / 2;
		} else {
			System.out.println("O valor ficou: " + this.valor);
			return this.valor;
		}
		
	}
	
	
	public double setingressoNormal() {
		this.valor = valorbase;
		System.out.println("o valor do ingresso inteiro e de: " + this.valor);
		return this.valor;
	}
	
	public double setingresso3D() {
		this.valor = valorbase * 2;
		System.out.println("o valor do ingresso inteiro e de: " + this.valor);
		return this.valor;
	}
	
	public double setingressoNamoradeira() {
		this.valor = valorbase * 3;
		System.out.println("o valor do ingresso inteiro e de: " + this.valor);
		return this.valor;
	}
	
}
