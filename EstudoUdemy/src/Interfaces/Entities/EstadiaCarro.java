package Interfaces.Entities;

import java.time.LocalDateTime;
import java.util.Date;

public class EstadiaCarro {

	private LocalDateTime comeco;
	private LocalDateTime fim;
	
	public EstadiaCarro(LocalDateTime comeco, LocalDateTime fim) {
		this.comeco = comeco;
		this.fim = fim;
	}

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

	@Override
	public String toString() {
		return "EstadiaCarro{" +
				"comeco=" + comeco +
				", fim=" + fim +
				'}';
	}
}
