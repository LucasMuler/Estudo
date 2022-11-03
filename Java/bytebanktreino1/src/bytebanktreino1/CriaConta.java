package bytebanktreino1;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234, 02);
		Conta segundaConta = new Conta(2222, 01);
		
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		System.out.println("vou depositar 30 reais");
		
		primeiraConta.deposita(30);
		System.out.println(primeiraConta.saldo);
		
		System.out.println("vou sacar 50 reais");
		
		primeiraConta.saca(340);
		System.out.println(primeiraConta.saldo);
		
		System.out.println("vou transferir 100 reais");
		
		primeiraConta.transfere(100, segundaConta);
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		//Criando um cliente e atrelando ele a uma conta
		
		cliente clienteLucas = new cliente();
		clienteLucas.titular = primeiraConta;
		
		clienteLucas.cpf = "222.222.222-22";
		clienteLucas.nome = "Lucas";
		clienteLucas.profissao = "Suporte-Técnico";
		
				
		System.out.println(clienteLucas.titular);
		System.out.println(primeiraConta);
		
		//primeiraConta.titular = clienteLucas;
		
		// System.out.println(primeiraConta.titular.cpf);
		
	}
}
