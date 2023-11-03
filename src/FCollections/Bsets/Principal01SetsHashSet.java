package FCollections.Bsets;

import java.util.HashSet;
import java.util.Set;

public class Principal01SetsHashSet {

    public static void main(String[] args) {

        /**
         * Set - interface, não permite valores repetidos, e seus valores não
         * são ordenados, por isso não tem como obter por index.
         *
         * HashSet - implementa uma lista não ordenada de valores unicos, usando o
         * equals e hashCode para comparar, e não mantém a ordem de inserção.
         *
         */

        Set<String> nomes = new HashSet<>();
        nomes.add("ana");
        nomes.add("joão");
        nomes.add("carlos");
        nomes.add("joão");
        nomes.add("maria");
        nomes.add("maria");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------------------");

        Pessoa p1 = new Pessoa("joão");
        Pessoa p2 = new Pessoa("joão");
        Pessoa p3 = new Pessoa("maria");
        Pessoa p4 = new Pessoa("maria");

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(p1);
        pessoas.add(p3);
        pessoas.add(p2);
        pessoas.add(p4);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }
}

