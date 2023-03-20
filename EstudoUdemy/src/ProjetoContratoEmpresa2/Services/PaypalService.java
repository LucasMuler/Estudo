package ProjetoContratoEmpresa2.Services;

import ProjetoContratoEmpresa2.Interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    private final double fee_percentage = 0.02;
    private final double Monthly_Interest = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * fee_percentage;
    }

    @Override
    public double interest(double amout, int mounths) {
        return amout * mounths * Monthly_Interest;
    }

}
