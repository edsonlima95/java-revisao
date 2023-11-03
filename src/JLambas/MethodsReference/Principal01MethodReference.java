package JLambas.MethodsReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal01MethodReference {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList(List.of(new Pessoa("maria", 15), new Pessoa("edson", 20)));

        System.out.println("------------Method Reference estático-------------");

        Collections.sort(pessoas, PessoaComparator::comparaPorNome);

        System.out.println(pessoas);

        System.out.println("------------Method Reference instância-------------");
        System.out.println();

        PessoaComparator pessoaComparator = new PessoaComparator();

        Collections.sort(pessoas, pessoaComparator::comparaPorIdade);

        System.out.println(pessoas);

    }
}
