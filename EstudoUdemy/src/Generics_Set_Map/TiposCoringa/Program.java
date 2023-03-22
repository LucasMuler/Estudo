package Generics_Set_Map.TiposCoringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,10);

        printList(list);
    }

    public static void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
