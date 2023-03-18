package ProjetoContratoEmpresa.Entities;

import ProjetoContratoEmpresa.Interfaces.Taixas;

public class TaixasPayPal implements Taixas {

    private Pagamento pagamento;

    public TaixasPayPal(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public double calcTaixa(int mes) {

        double taixafinal = 0;
        double valor = pagamento.getValorParcelas();

        double taixaPayPal = valor + valor * (0.01 * mes);
        taixafinal = taixaPayPal + taixaPayPal * 0.02;

        return taixafinal;
    }

}
