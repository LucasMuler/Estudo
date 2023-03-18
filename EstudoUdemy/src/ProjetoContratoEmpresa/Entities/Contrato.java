package ProjetoContratoEmpresa.Entities;

import java.time.LocalDate;

public class Contrato {

    private int numero;
    private LocalDate data;
    private double valor;

    public Contrato(int numero, LocalDate data, double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
