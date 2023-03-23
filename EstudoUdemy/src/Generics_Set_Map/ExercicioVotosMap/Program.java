package Generics_Set_Map.ExercicioVotosMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String,Integer> candidatos = new HashMap<>();
        String path = "C:\\temp\\in.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
        String line = bf.readLine();

        while (line != null){
            String[] array = line.split(",");
            String nome = array[0];
            int value = Integer.parseInt(array[1]);
            int aux = value;
            if(candidatos.containsKey(nome)){
                aux += candidatos.get(nome);
                candidatos.put(nome,aux);
            } else{
                candidatos.put(nome,value);
            }

            line = bf.readLine();
        }} catch (IOException e){
            e.getMessage();
        }

        for (String key: candidatos.keySet()) {
            System.out.println(key + ": " +candidatos.get(key));
        }

    }
}
