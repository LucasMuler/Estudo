package Interfaces.ProgramaCarrosDeAluguel.Entities;

public class Carros {

	private String modelo;

	public Carros() {

	}

	public Carros(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Carros [modelo=" + modelo + "]";
	}

}
