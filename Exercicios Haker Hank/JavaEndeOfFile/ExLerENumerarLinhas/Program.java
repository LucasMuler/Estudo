package JavaEndeOfFile.ExLerENumerarLinhas;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner stdin =new Scanner(System.in);
        int n=1;
        do {
            System.out.println(n+++" "+stdin.nextLine());
        }
        while (stdin.hasNext());
        stdin.close();
    }
}
