
public class Conexao1 implements AutoCloseable {

	public void AbrindoConexao() {
		System.out.println("esta sendo aberta uma conexão");
	}
	
	public void LendoDados() {
		System.out.println("O programa esta lendo dados");
		throw new IllegalStateException();
	}

	@Override
	public void close(){
		System.out.println("Fechando o programa");
	}
	
}
