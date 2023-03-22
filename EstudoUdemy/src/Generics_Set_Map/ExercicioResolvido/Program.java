package Generics_Set_Map.ExercicioResolvido;

import Generics_Set_Map.ExercicioResolvido.Entities.Usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path = "C:\\temp\\in.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){

            Set<Usuarios> listaEntrada = new HashSet<>();

            String line = bf.readLine();

            while (line != null){
                String[] array = line.split(" ");
                String nome = array[0];
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
                LocalDate data = LocalDate.parse(array[1],fmt);

                Usuarios u = new Usuarios(nome,data);
                listaEntrada.add(u);
                line = bf.readLine();
            }

            System.out.println("Total users: " + listaEntrada.size());

        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
