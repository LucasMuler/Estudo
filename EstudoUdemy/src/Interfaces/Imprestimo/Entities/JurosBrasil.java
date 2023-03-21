package Interfaces.Imprestimo.Entities;

import Interfaces.Imprestimo.JurosLocal;

public class JurosBrasil implements JurosLocal {

    private double valorMensal;

    public JurosBrasil(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    @Override
    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

}
