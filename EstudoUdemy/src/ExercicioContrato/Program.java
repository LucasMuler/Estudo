package ExercicioContrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ExercicioContrato.Entities.Contrato;
import ExercicioContrato.Entities.Departamento;
import ExercicioContrato.Entities.NivelDoFuncionario;
import ExercicioContrato.Entities.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o nome do departamento");
		String departamento = sc.nextLine();
		Departamento dp = new Departamento(departamento);
		
		System.out.println("Entre com as informações do funcioanrio");
		System.out.println("Nome");
		String nome = sc.nextLine();
		System.out.println("Dentre os niveis: JUNIOR, MID_LEVEL e SENIOR em qual vc se classificaria?");
		String nivel = sc.nextLine();
		System.out.println("Salario base");
		double salarioBase = sc.nextDouble();
		sc.nextLine();
		Worker wk = new Worker(nome, NivelDoFuncionario.valueOf(nivel), salarioBase);
		
		System.out.println("Quantos contratos este funcionario tem");
		int numeroContratos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numeroContratos; i++) {
			System.out.println("Entre o contrato n° " + (i+1));
			System.out.println("Data (DD/MM/YYYY)");
			String dateString = sc.nextLine();
			System.out.println("Valor por hora");
			double valorPorHora = sc.nextDouble();
			sc.nextLine();
			System.out.println("Horas");
			int horas = sc.nextInt();
			sc.nextLine();
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(dateString);
			
			Contrato c1 = new Contrato(date,valorPorHora,horas);
			wk.adicionaContrato(c1);
		}
		
		
		System.out.println("Entre o mes e o ano para calcular a renda do mesmo");
		System.out.println("mes em seguida do ano");
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		sc.nextLine();
		
		System.out.println(wk.income(mes, ano));
		
		sc.close();
	}
	
}
