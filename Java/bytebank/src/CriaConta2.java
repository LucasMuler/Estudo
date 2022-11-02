
public class CriaConta2 {
	public static void main(String[] args) {
		Conta2 novaConta1 = new Conta2();
		novaConta1.saldo = 300;
		novaConta1.numero = 0324;
		novaConta1.agencia = 01;
		novaConta1.titular = "Lucas";
		System.out.println("O saldo da sua conta é R$:" + novaConta1.saldo);
		System.out.println("O saldo da sua conta é R$:" + novaConta1.numero);
		System.out.println("O saldo da sua conta é R$:" + novaConta1.agencia);
		System.out.println("O saldo da sua conta é R$:" + novaConta1.titular);
		
		Conta2 novaConta2 = new Conta2();
		
		novaConta2.saldo = 200;
		System.out.println(novaConta2.saldo);
		
	}
}