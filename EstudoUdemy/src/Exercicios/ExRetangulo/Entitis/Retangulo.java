package Exercicios.ExRetangulo.Entitis;

public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo(int largura, int altura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	/*
	 * Metodos exigidos
	 */
	
	public double getArea() {
		return this.largura * this.altura;
	}
	
	public double getPerimetro() {
		return 2*(this.altura + this.largura);
	}
	
	public double getDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	/*
	 * Geters e seters
	 */
	public void setLargura(double largura) {
		this.largura = largura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
