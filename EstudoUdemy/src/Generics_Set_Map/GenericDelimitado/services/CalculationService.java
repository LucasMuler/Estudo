package Generics_Set_Map.GenericDelimitado.services;

import java.util.List;

public class CalculationService {

    public static Integer max(List<Integer> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        Integer max = list.get(0);
        for (Integer i: list) {
            if (i.compareTo(max) > 0){
                max = i;
            }
        }
        return max;
    }

}
