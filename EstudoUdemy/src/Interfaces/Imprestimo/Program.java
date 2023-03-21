package Interfaces.Imprestimo;

import Interfaces.Imprestimo.Entities.JurosBrasil;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * input
         */
        System.out.print("Ammount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Months: ");
        int mounth = sc.nextInt();
        sc.nextLine();

        /**
         * output
         */
        System.out.println("Payment after " + mounth + " months: ");
        JurosLocal j = new JurosBrasil(2);
        System.out.println(j.pagamento(amount, mounth));

        sc.close();

    }
}
