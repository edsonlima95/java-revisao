package FCollections.Alistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal01Listas {

    public static void main(String[] args) {

        //Outras formas de criar arrays.
        List<String> nomes2 = new ArrayList(Arrays.asList("joaquim", "safira", "naja"));
        List<Integer> numeros = new ArrayList(List.of(1, 2, 3, 4, 5));

        //Forma comum.
        List<String> nomes = new ArrayList();

        //Adiciona
        nomes.add("edson");
        nomes.add("joão");
        nomes.add("maria");

        //Itera sobre a lista
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Verifica se contem um valor.
        System.out.println(nomes.contains("edson"));

        //Obtem um item pelo index.
        System.out.println(nomes.get(0));

        //Verifica se a lista está vázia.
        System.out.println(nomes.isEmpty());

        //Substitui um valor por outro, joão por pedro.
        System.out.println(nomes.set(1, "pedro"));
        System.out.println(nomes.toString());

        //Adiciona na posição 2 cassandra.
        nomes.add(2, "cassandra");
        System.out.println(nomes.toString());

        //Retorna o index de cassandra
        System.out.println(nomes.indexOf("cassandra"));

        Collections.sort(nomes);

        //Itera sobre a lista
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
