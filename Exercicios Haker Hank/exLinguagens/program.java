package exLinguagens;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String linguagem = sc.next();
            int nota = sc.nextInt();
            System.out.printf("%-15s", linguagem);
            System.out.printf("%03d", nota);
            System.out.println();
        }
        System.out.println("================================");
    }

}
