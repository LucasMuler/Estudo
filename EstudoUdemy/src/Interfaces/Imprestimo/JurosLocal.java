package Interfaces.Imprestimo;

public interface JurosLocal {

    double getValorMensal();

    default double pagamento(double amount, int months){
        return amount * Math.pow(1 + getValorMensal() / 100, months);
    }

}
