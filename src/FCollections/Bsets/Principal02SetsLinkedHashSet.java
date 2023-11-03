package FCollections.Bsets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal02SetsLinkedHashSet {

    public static void main(String[] args) {
        /**
         * LinkedHashSet - mantém a ordem de inserção dos dados, e não permite
         * items duplicados.
         */
        Set<Pessoa> pessoas = new LinkedHashSet<>();

        Pessoa p1 = new Pessoa("ana");
        Pessoa p2 = new Pessoa("oabi");
        Pessoa p3 = new Pessoa("breno");
        Pessoa p4 = new Pessoa("melio");

        pessoas.add(p1);
        pessoas.add(p3);
        pessoas.add(p2);
        pessoas.add(p4);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }

}
