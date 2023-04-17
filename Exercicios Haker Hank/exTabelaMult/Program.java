package exTabelaMult;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        if (numero >= 2 && numero <= 20){
            for(int i = 1; i <= 10; i++){
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            throw new InputMismatchException("Não está dentro do range de 2 a 20");
        }

        sc.close();

    }
}
