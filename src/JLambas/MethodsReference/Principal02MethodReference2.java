package JLambas.MethodsReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Principal02MethodReference2 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList(List.of("maria","pedro","joão","bernardo"));

        nomes.sort(String::compareTo);

        System.out.println(nomes);

        System.out.println("-----------CONVERTE PARA INTEIRO-------------");

        Function<String, Integer> converterParaInteiro = Integer::parseInt;

        System.out.println(converterParaInteiro.apply("10"));

        System.out.println("----------VERIFICA SE NOME EXISTE--------------");

        BiPredicate<List<String>, String> nomeExiste = List::contains;

        System.out.println(nomeExiste.test(nomes,"JOÃO".toLowerCase()));

    }
}
