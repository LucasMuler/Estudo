package Exercicios.ExSalario.entities;

public class Funcionario {

	private String name;
	private double salarioBruto;
	private double tax;
	
	public Funcionario(String name, double salarioBruto, double tax) {
		this.name = name;
		this.salarioBruto = salarioBruto;
		this.tax = tax;
	}
	
	public double NetSalary() {
		return salarioBruto - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		salarioBruto += ((percentage / 100) * this.salarioBruto);
		
		System.out.println("Updated data: " + name + ", " + NetSalary());
	}
	
	public String toString() {
		return "Employee: " + name + ", " + NetSalary();
	}
}
