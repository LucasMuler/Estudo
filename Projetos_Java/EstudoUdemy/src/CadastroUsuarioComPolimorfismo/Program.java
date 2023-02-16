package CadastroUsuarioComPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CadastroUsuarioComPolimorfismo.Entities.Employee;
import CadastroUsuarioComPolimorfismo.Entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> listaDeFuncionarios = new ArrayList<>(); 
		
		System.out.println("Enter the number of employees");
		int numEmployee = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numEmployee; i++) {
			System.out.println("Employee n#" + (i+1));
			System.out.println("Outsourced? (y/n)");
			char ch = sc.next().charAt(0);
			
			if (ch == 'n') {
				listaDeFuncionarios.add(CadastroUsuarioPadrao());
			} if (ch == 'y') {
				listaDeFuncionarios.add(CadastroFuncionarioTerceirizado());
			}
		}
		
		System.out.println("Payments:");
		
		for (Employee employee : listaDeFuncionarios) {
			System.out.println(employee.getName() + " - $ " + employee.payment());
		}
		
		sc.close();
	}
	
	public static Employee CadastroUsuarioPadrao(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Hours:");
		int hours = sc.nextInt();
		sc.nextLine();
		System.out.println("Value per hour:");
		double valueHours = sc.nextDouble();
		sc.nextLine();
		sc.close();
		
		Employee e = new Employee(nome,hours,valueHours);
		
		return e;

	}
	
public static Employee CadastroFuncionarioTerceirizado(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Hours:");
		int hours = sc.nextInt();
		sc.nextLine();
		System.out.println("Value per hour:");
		double valueHours = sc.nextDouble();
		sc.nextLine();
		System.out.println("Additional charge:");
		double additionalCharge = sc.nextDouble();
		sc.nextLine();
		sc.close();
		
		Employee e = new OutsourcedEmployee(nome,hours,valueHours, additionalCharge);
		
		return e;

	}

}
