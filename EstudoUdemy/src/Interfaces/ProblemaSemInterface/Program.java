package Interfaces.ProblemaSemInterface;

import Interfaces.Entities.Carros;
import Interfaces.Entities.EstadiaCarro;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        /**
         * ---------------------------------------------------------------------
         * data input
         */
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
//		String model = sc.nextLine();
        String model = "Civic";
        System.out.println();
        System.out.print("Retirada (dd/MM/yy HH:mm): ");
//		String out = sc.nextLine();
        String out = "25/06/2018 10:30";
        System.out.println();
        System.out.print("Entrada (dd/MM/yy HH:mm): ");
//		String in = sc.nextLine();
        String in = "25/06/2018 14:40";
        System.out.println();
        System.out.print("Entre com o preco da hora: ");
//		double precoHora = sc.nextDouble();
//		sc.nextLine();
        double precoHora = 10.00;
        System.out.println();
        System.out.print("Entre com o preco dia: ");
//		double precoDia = sc.nextDouble();
//		sc.nextLine();
        double precoDia = 130.00;
        System.out.println();

        /**
         * ---------------------------------------------------------------------
         * Logic of the main code
         */

        LocalDateTime comeco = LocalDateTime.parse(out, fmt);
        LocalDateTime fim = LocalDateTime.parse(in, fmt);

        double periodoMinutos = comeco.until(fim, ChronoUnit.MINUTES);
        double periodoHoras = 0;
        double periodoDias = 0;
        double total = 0;
        int umDiaEmMinutos = 1440;

        Carros c = new Carros(model);
        EstadiaCarro ec = new EstadiaCarro(comeco,fim);

        /**
         * Logica de calculo de estadia
         */

        while(periodoMinutos > 0 && periodoMinutos > 740){
            periodoMinutos -= 740;
            periodoDias += 1;

            if (periodoMinutos >= 740){
                periodoMinutos -= 740;
            }

        }

        if (periodoDias >= 1 && periodoMinutos < 740){
            periodoDias += 1;
        }
        else {
            int aux = 740;
            if (periodoMinutos - 740 <= 0){
                total += calculoHora(periodoMinutos, precoHora);
            } else{
                periodoMinutos -= 740;
            }
        }

        total += precoDia * (int) (periodoDias);

        /**
         * ---------------------------------------------------------------------
         * data output
         */
        System.out.println(periodoMinutos);
        System.out.println(periodoHoras);
        System.out.println(periodoDias);
        System.out.println(total);
        sc.close();
    }

    public static double calculoHora(double periodoMinutos, double precoHora) {

        int periodoHoras = (int) (periodoMinutos / 60);
        periodoMinutos -= periodoHoras * 60;

        if (periodoMinutos % 60 > 0) {
            return (int) ((periodoHoras) + 1) * precoHora;
        } else {
            return (int) (periodoHoras) * precoHora;
        }
    }

}