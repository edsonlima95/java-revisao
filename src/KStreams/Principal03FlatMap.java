package KStreams;

import KStreams.classes.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Principal03FlatMap {

    public static void main(String[] args) {

        /**
         * FlatMap -é mais para trabalhar com Listas encadeadas, quando se tem
         * uma List<List<String>> listas multidimensionais.
         */

        List<List<Produto>> cursos = new ArrayList<>();

        List<Produto> programacao = List.of(new Produto("Curso de java", 300.00), new Produto("Curso de reacj js", 700.00));
        List<Produto> desgin = List.of(new Produto("Curso de inkscape", 600.00), new Produto("Curso de gimp", 450.00));
        List<Produto> edicaoVideos = List.of(new Produto("Curso de vegas", 800.00), new Produto("Curso de davince", 1300.00));

        cursos.add(programacao);
        cursos.add(desgin);
        cursos.add(edicaoVideos);


        //Imprime todos
        cursos.stream().flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Filtra e depois imprime.
        cursos.stream().flatMap(Collection::stream)
                .filter(produto -> produto.getPreco() > 500)
                .forEach(System.out::println);

    }
}
