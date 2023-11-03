package JLambas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Principal03Function {

    public static void main(String[] args) {

        List<String> nomes = List.of("edson","maria","joão");

        //Aqui pode retorna qualquer coisa, strings inteiros depende da condiçã.
        List<String> nomesMaiusculas = map(nomes, nome -> nome.toUpperCase());
        List<Integer> nomesQuantidade = map(nomes, nome -> nome.length());

        System.out.println(nomesMaiusculas);

        System.out.println();

        System.out.println(nomesQuantidade);

    }
    /**
     * T - é o tipo passado
     * R - é o retorno.
     * */
    public static <T, R>List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();

        for (T e: list){
            R apply = function.apply(e);
            result.add(apply);
        }

        return result;
    }

}
