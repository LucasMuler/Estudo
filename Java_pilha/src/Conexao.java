
public class Conexao {

	public void ProgramaQueAbreConexao(){
		System.out.println("iniciando uma nova conexão");
	}
	
	public void ProgramaQueleDados() {
		System.out.println("analizando os dados");
		throw new IllegalStateException();
	}
	
	public void ProgramaQueFechaConexão() {
		System.out.println("Fechando a conexão");
	}
}
