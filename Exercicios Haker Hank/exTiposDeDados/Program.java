package exTiposDeDados;

import java.util.*;
import java.io.*;

public class Program{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int tamanhoByte = 128;
        int tamanhoShort = 32768;
        double tamanhoInt = Math.pow(2,31);
        double tamanhoLong = Math.pow(2,63);

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                int y = 0;
                System.out.println(x+" can be fitted in:");

                if(x>=-tamanhoByte && x<=tamanhoByte-1){
                    y++;
                    System.out.println("* byte");
                }
                if(x>=-tamanhoShort && x<=tamanhoShort-1){
                    y++;
                    System.out.println("* short");
                }
                if(x>=-tamanhoInt && x<=tamanhoInt - 1){
                    y++;
                    System.out.println("* int");
                }
                if(x>=-tamanhoLong && x<=tamanhoLong - 1){
                    y++;
                    System.out.println("* long");
                }

                if(y == 0){
                    throw new Exception();
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
