
public abstract class Funcionario {

	private String nome;
	private String CPF;
	private double saldo;
	
	// metodos 
	
	public abstract double getbonificacao();
	
	
	// get e set
	
	public String getnome() {
		return this.nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
}
