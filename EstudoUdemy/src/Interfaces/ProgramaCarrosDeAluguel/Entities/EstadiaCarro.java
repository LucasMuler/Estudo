package Interfaces.ProgramaCarrosDeAluguel.Entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EstadiaCarro {

	private LocalDateTime comeco;
	private LocalDateTime fim;
	private double periodoMinutos = 0;
	private double periodoDias = 0;
	private double total = 0;
	
	public EstadiaCarro(LocalDateTime comeco, LocalDateTime fim) {
		this.comeco = comeco;
		this.fim = fim;
		periodoMinutos = comeco.until(fim, ChronoUnit.MINUTES);
	}



	/**
	 * Getters e setters
	 * @return
	 */

	public LocalDateTime getComeco() {
		return comeco;
	}

	public void setComeco(LocalDateTime comeco) {
		this.comeco = comeco;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public double getPeriodoMinutos() {
		return periodoMinutos;
	}

	public double getPeriodoDias() {
		return periodoDias;
	}

	public double getTotal() {
		return total;
	}

	/**
	 * this part of the code calculate the basic paying in base of the number of days and hours
	 * @param precoHora
	 * @param precoDia
	 * @return
	 */

	public int calculaEstadia(double precoHora, double precoDia){

		periodoDias = 0;

		while(periodoMinutos > 0 && periodoMinutos > 740){
			periodoMinutos -= 740;
			periodoDias += 1;

			if (periodoMinutos >= 740){
				periodoMinutos -= 740;
			}

		}

		if (periodoDias >= 1 && periodoMinutos < 740){
			periodoDias += 1;
		}
		else {
			int aux = 740;
			if (periodoMinutos - 740 <= 0){
				total += calculoHora(periodoMinutos, precoHora);
			} else{
				periodoMinutos -= 740;
			}
		}

		total += precoDia * (int) (periodoDias);

		return (int) total;
	}

	/**
	 * metodo simples para apenas auxiliar o metodo de calculo acima, o mesmo tem o objetivo de calcular as horas
	 * @param periodoMinutos
	 * @param precoHora
	 * @return
	 */

	public static double calculoHora(double periodoMinutos, double precoHora) {

		int periodoHoras = (int) (periodoMinutos / 60);
		periodoMinutos -= periodoHoras * 60;

		if (periodoMinutos % 60 > 0) {
			return (int) ((periodoHoras) + 1) * precoHora;
		} else {
			return (int) (periodoHoras) * precoHora;
		}
	}

}
