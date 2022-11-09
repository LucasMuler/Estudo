
public class Teste {

	public static void main(String[] args) {
		
		Administrador f1 = new Administrador();
		Gerente f2 = new Gerente();
		
		System.out.println(f1.getbonificacao());
		System.out.println(f2.getbonificacao());
		
		f2.setsenha(3698);
		System.out.println(f2.autentica(3698));
		
		

	}

}
