package br.com.NomeEmpresa.NomeProjeto.Ingresso;

/**
 * 
 * Classe do ingresso, que serve como intermedio para encontrar e alterar os valores dos mesmos.
 * 
 * @author miill
 *
 */

public class Ingresso {

	private double valorBase = 12;
	private double valor;
	
	/**
	 * 
	 * geters e seters do valor base 
	 * 
	 * @return
	 */
	
	public double getValorBase() {
		return valorBase;
	}
	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	
	/**
	 * 
	 * Geters e Seters do valor podendo alterar o valor para 3 opções sendo elas:
	 * Nomal: tem o mesmo valor que a base
	 * 3D: é o valor base mais um terço do mesmo 
	 * Namoradeira: É o valor base x2; 
	 * 
	 * @return
	 */
	
	public double getValor() {
		return valor;
	}
	
	public double setValorNormal() {
		valor = valorBase;
		return valor;
	}
	
	public double setValor3D() {
		valor = valorBase / 3 + valorBase;
		return valor;
	}
	
	public double setValorNamoradeira() {
		valor = valorBase * 2;
		return valor;
	}
	
}
