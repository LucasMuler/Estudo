package Generics_Set_Map.ExemploSet;

import java.util.Set;
import java.util.TreeSet;

public class ExemplosDeUsoSet {
    public static void main(String[] args) {
        // Criar um novo conjunto
        Set<String> meuSet = new TreeSet<>();

        // Adicionar elementos ao conjunto
        meuSet.add("elemento1");
        meuSet.add("elemento2");
        meuSet.add("elemento3");
        meuSet.add("elemento2"); // este elemento não será adicionado, pois já existe no conjunto
        meuSet.add("Lucas");

        // Imprimir o conjunto
        System.out.println(meuSet);

        // Verificar se um elemento está presente no conjunto
        boolean contemElemento2 = meuSet.contains("elemento2");
        System.out.println(contemElemento2);

        // Remover um elemento do conjunto
        meuSet.remove("elemento3");

        //remove um elemento com predicado
        meuSet.removeIf(x -> x.charAt(0) == 'e');

        // Imprimir o conjunto novamente
        System.out.println(meuSet);
    }
}
