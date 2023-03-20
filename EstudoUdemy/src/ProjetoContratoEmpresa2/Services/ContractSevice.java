package ProjetoContratoEmpresa2.Services;

import ProjetoContratoEmpresa2.Entities.Contract;
import ProjetoContratoEmpresa2.Entities.Installment;
import ProjetoContratoEmpresa2.Interfaces.OnlinePaymentService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractSevice {

    private OnlinePaymentService onlinePaymentService;
    List<Installment> lista = new ArrayList<>();

    public ContractSevice(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract c, int numeroParcelas) {

        for (int i = 1; i <= numeroParcelas; i++){
            double valorMensal = c.getTotalValue() / numeroParcelas;
            LocalDate date = c.getDate().plusMonths(i);
            valorMensal += onlinePaymentService.interest(valorMensal,i);
            valorMensal += onlinePaymentService.paymentFee(valorMensal);
            Installment installment = new Installment(date, valorMensal);
            lista.add(installment);
            System.out.println(installment);
        }
    }

    private LocalDateTime addMonths(LocalDateTime date, int n){
        return date.plusMonths(n);
    }
}
