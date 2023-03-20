package ProjetoContratoEmpresa2;

import ProjetoContratoEmpresa2.Entities.Contract;
import ProjetoContratoEmpresa2.Services.ContractSevice;
import ProjetoContratoEmpresa2.Services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        /**
         * Inputs
         */

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(),fmt);
        System.out.println();
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.print("Entre com o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();
        System.out.println();

        /**
         * main code logic
         */

        Contract c = new Contract(numero,data,valor);
        ContractSevice service = new ContractSevice(new PaypalService());

        /**
         * output
         */
        System.out.println("Parcelas: ");
        service.processContract(c,numeroParcelas);
        sc.close();


    }
}
