package ProjetoContratoEmpresa.Entities;

public class Pagamento {

    private Contrato contrato;
    private int numeroDeParcelas;
    private double valorParcelas;


    public Pagamento(Contrato contrato, int numeroDeParcelas) {
        this.contrato = contrato;
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public double getValorParcelas() {
        double valor = contrato.getValor()/numeroDeParcelas;
        return valor;
    }

}
