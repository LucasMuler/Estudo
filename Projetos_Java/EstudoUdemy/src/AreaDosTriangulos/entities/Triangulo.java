package AreaDosTriangulos.entities;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	
	public double calculaP() {
		return (this.a + this.b + this.c) / 2;
	}
	
	public double calculaArea() {
		double p2 = calculaP();
		return Math.sqrt(p2 * (p2 - this.a) * (p2 - this.b) * (p2 - this.c));
	}
	
	public void printArea() {
		System.out.printf("Triangle X area %.4f%n", this.calculaArea());
	}
	
}
