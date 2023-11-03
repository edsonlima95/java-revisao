package KStreams;

import KStreams.classes.Produto;

import java.util.Comparator;
import java.util.List;

public class Principal04Matches {

    public static void main(String[] args) {

        /**
         * anyMatch - verifica se tem alguma item que responda a condição.
         */

        List<Produto> cursos = List.of(
                new Produto("Curso de java", 300.00),
                new Produto("Curso de reacj js", 200.00),
                new Produto("Curso de inkscape", 600.00),
                new Produto("Curso de gimp", 450.00));


        //Verifica se tem items acima de 400
        System.out.println(cursos.stream().anyMatch(curso -> curso.getPreco() > 400.00)); //true

        //se tem qualquer um ou pelo menos um item menor que 0.
        System.out.println(cursos.stream().anyMatch(curso -> curso.getPreco() < 10)); //false

        //se todos os itens são maior que 50.
        System.out.println(cursos.stream().allMatch(curso -> curso.getPreco() > 50)); //true


        System.out.println("--------------------------");

        //Retorna o primeiro da lista, a ordem importa dos elemetos que satisfazer a condição
        cursos.stream().filter(curso -> curso.getPreco() > 30.00)
                .findAny().ifPresent(System.out::println); //Curso de Java

        //Encontra o primeiro da lista, a ordem não importa.
        cursos.stream().filter(curso -> curso.getPreco() > 30.00)
                .sorted(Comparator.comparing(Produto::getPreco))
                .findFirst().ifPresent(System.out::println); //Curso de Java


    }

}
