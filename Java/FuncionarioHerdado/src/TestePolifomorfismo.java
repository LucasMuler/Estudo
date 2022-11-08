
public class TestePolifomorfismo {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		
		System.out.println(	g1.getNome());

	}

}
