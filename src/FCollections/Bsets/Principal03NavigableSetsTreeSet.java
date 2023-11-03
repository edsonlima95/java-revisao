package FCollections.Bsets;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Principal03NavigableSetsTreeSet {

    public static void main(String[] args) {
        /**
         * TreeSet - não permite items duplicados, todos os items serão inseridos
         * por ordem entao todo objetos deve ser comparable ou comparator
         */
        NavigableSet<Pessoa> pessoas = new TreeSet(new PessoaSorting());

        Pessoa p1 = new Pessoa("ana");
        Pessoa p2 = new Pessoa("carlos");
        Pessoa p3 = new Pessoa("breno");
        Pessoa p4 = new Pessoa("edson");
        Pessoa p5 = new Pessoa("edson");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }

}
