package Generics_Set_Map.GenericDelimitado.services;

import java.util.List;

public class CalculationService {

    /**
     * Um tipo T qualquer extende a classe comparable recebendo como um parametro um outro tipo T
     * este metodo retorna um tipo T e recebe um lista de tipos T quer tem o endereço list
     * @param list
     * @return
     * @param <T>
     */

    public static <T extends  Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        T max = list.get(0);
        for (T i: list) {
            if (i.compareTo(max) > 0){
                max = i;
            }
        }
        return max;
    }

}
