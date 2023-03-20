package ProjetoContratoEmpresa2.Interfaces;

public interface OnlinePaymentService {

    public double paymentFee(double amount);
    public double interest(double amout,int mounths);

}
