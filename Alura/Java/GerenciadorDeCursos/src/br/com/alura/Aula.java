package br.com.alura;

public class Aula implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {

		return "Aula: " + this.titulo + " Com " + this.tempo +" minutos";
	}

	@Override
	public int compareTo(Aula o) {
		return this.titulo.compareTo(o.titulo);
	}
}
