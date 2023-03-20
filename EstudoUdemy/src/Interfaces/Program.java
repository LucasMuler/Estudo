package Interfaces;

import Interfaces.Entities.Carros;
import Interfaces.Entities.EstadiaCarro;
import Interfaces.Entities.ImpostoBrasileiro;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		String model = sc.nextLine();
        System.out.println();
        System.out.print("Retirada (dd/MM/yy HH:mm): ");
		String out = sc.nextLine();
        System.out.println();
        System.out.print("Entrada (dd/MM/yy HH:mm): ");
		String in = sc.nextLine();
        System.out.println();
        System.out.print("Entre com o preco da hora: ");
		double precoHora = sc.nextDouble();
		sc.nextLine();
        System.out.println();
        System.out.print("Entre com o preco dia: ");
		double precoDia = sc.nextDouble();
		sc.nextLine();
        System.out.println();

        /**
         * ---------------------------------------------------------------------
         * Logic of the main code
         */

        LocalDateTime comeco = LocalDateTime.parse(out, fmt);
        LocalDateTime fim = LocalDateTime.parse(in, fmt);

        Carros c = new Carros(model);
        EstadiaCarro ec = new EstadiaCarro(comeco,fim);
        ImpostoBrasileiro i = new ImpostoBrasileiro(ec);

        ec.calculaEstadia(precoHora, precoDia);
        double tax = i.calcTax();

        /**
         * ---------------------------------------------------------------------
         * data output
         */

        System.out.println("INVOICE:");
        System.out.print("Basic payment: " + ec.getTotal());
        System.out.println();
        System.out.println("Tax: " + tax);
        System.out.println("Total payment: " + (ec.getTotal() + tax));
        sc.close();
    }

}