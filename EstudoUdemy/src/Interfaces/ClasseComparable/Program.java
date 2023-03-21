package Interfaces.ClasseComparable;

import Interfaces.ClasseComparable.Entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Funcionario> listaNomes = new ArrayList<>();
        String path = "C:\\temp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();


            while (line != null){
                String array[] = new String[1];
                array = line.split(",");
                String nome = array[0];
                double valor = Double.parseDouble(array[1]);
                Funcionario f = new Funcionario(nome,valor);
                listaNomes.add(f);
                line = br.readLine();
            }

            Collections.sort(listaNomes);

            for (Funcionario func : listaNomes) {
                System.out.println(func.getName() + "," + func.getSalary());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
