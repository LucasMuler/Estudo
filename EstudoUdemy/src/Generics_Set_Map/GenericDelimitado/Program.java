package Generics_Set_Map.GenericDelimitado;

import Generics_Set_Map.GenericDelimitado.Entities.Product;
import Generics_Set_Map.GenericDelimitado.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";
        List<Product> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){

            String line = bf.readLine();
            while (line != null){
                String[] array = line.split(",");
                String nome = array[0];
                double value = Double.parseDouble(array[1]);
                list.add(new Product(nome,value));
                line = bf.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("max: " + x);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}

