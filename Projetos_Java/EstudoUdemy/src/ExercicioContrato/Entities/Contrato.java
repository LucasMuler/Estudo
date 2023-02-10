package ExercicioContrato.Entities;

import java.util.Date;

public class Contrato {

	private Date date;
	private double valorPorHora;
	private int horas;
	
	public Contrato(Date date, double valorPorHora, int horas) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double totalValue() {
		return this.valorPorHora * this.horas;
	}

	@Override
	public String toString() {
		return "Contrato [date=" + date + ", valorPorHora=" + valorPorHora + ", horas=" + horas + "]";
	}
	
	
	
}
