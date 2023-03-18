package ProjetoContratoEmpresa;

import ProjetoContratoEmpresa.Entities.Contrato;
import ProjetoContratoEmpresa.Entities.Pagamento;
import ProjetoContratoEmpresa.Entities.TaixasPayPal;
import ProjetoContratoEmpresa.Interfaces.Taixas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        /**
         * inputs do sistema
         */
        System.out.println("Entro os dados do contrato");

        System.out.print("Numero: ");
//        int numero = sc.nextInt();
        int numero = 8028;
        System.out.println();

        System.out.print("Data (dd/MM/yyyy): ");
//        LocalDateTime comeco = LocalDateTime.parse(sc.nextLine(), fmt);

        String date = "18/12/2002";
        LocalDate comeco = LocalDate.parse(date,fmt);
        System.out.println();

        System.out.print("Valor do contrato: ");
//        double valor = sc.nextDouble();
//        sc.nextLine();
        double valor = 600.00;
        System.out.println();

        System.out.print("Entre com o numero de parcelas: ");
//        int numeroParcelas = sc.nextInt();
//        sc.nextLine();
        int numeroParcelas = 3;
        System.out.println();

        /**
         * Logic of main code
         */

        Contrato c = new Contrato(numero, comeco, valor);
        Pagamento p = new Pagamento(c, numeroParcelas);
        Taixas taixa = new TaixasPayPal(p);


        /**
         * Output
         */

        System.out.println("Parcelas: ");
        for (int i = 1; i <= p.getNumeroDeParcelas(); i++){
            System.out.print(comeco.plusMonths(i) + " - ");
            System.out.println(taixa.calcTaixa(i));
        }

        sc.close();
    }
}
