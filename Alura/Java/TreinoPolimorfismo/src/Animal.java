
public class Animal {

	private int numeroPatas = 4;
	private int numeroOrelhas = 2;
	private boolean temDentes = true;
	
	public void andar() {
		System.out.println("andando");
	}
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void som() {
		System.out.println("fazendo algum som");
	}
	
	
	public int getNumeroPatas() {
		return numeroPatas;
	}

	public int getNumeroOrelhas() {
		return numeroOrelhas;
	}


	public boolean getTemDentes() {
		return temDentes;
	}

	
}
