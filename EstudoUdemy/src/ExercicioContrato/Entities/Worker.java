package ExercicioContrato.Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String nome;
	private NivelDoFuncionario nivel;
	private double salarioBase;
	private Departamento dp;
	
	List<Contrato> listaDeContratos = new ArrayList<>();
	
	public Worker(String nome, NivelDoFuncionario nivel, double salarioBase) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoFuncionario nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Contrato getListaDeContratos(int index) {
		return listaDeContratos.get(index);
	}
	
	public void adicionaContrato(Contrato contrato) {
		listaDeContratos.add(contrato);
	}
	
	public void removeContrato(Contrato contrato) {
		listaDeContratos.remove(contrato);
	}

	
	
	public double income(int year, int month) {
		double sum = 0;
		Calendar cal = Calendar.getInstance();
		for (Contrato contrato : listaDeContratos) {
			cal.setTime(contrato.getDate());	
			int c_year = cal.get(Calendar.YEAR);
			int c_month = (cal.get(Calendar.MONTH)+1);
			
			if (year == c_year && month == c_month) {
				sum += contrato.totalValue();
			}
		}
		
		return sum += this.salarioBase;
		
	}
	
	
	@Override
	public String toString() {
		return "Worker [nome=" + nome + ", nivel=" + nivel + ", salarioBase=" + salarioBase + "]";
	}

	

	
}
