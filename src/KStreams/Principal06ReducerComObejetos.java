package KStreams;

import KStreams.classes.Produto;

import java.util.List;

public class Principal06ReducerComObejetos {

    public static void main(String[] args) {

        List<Produto> cursos = List.of(
                new Produto("Curso de java", 300.00),
                new Produto("Curso de reacj js", 200.00),
                new Produto("Curso de inkscape", 600.00),
                new Produto("Curso de gimp", 450.00));

        //Soma o valor de todos os cursos
        cursos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .map(Produto::getPreco)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("--------------------------");

        double total = cursos.stream()
                .filter(produto -> produto.getPreco() > 200)//Soma todos maior que 200.
                .mapToDouble(Produto::getPreco) //map para double
                .sum();

        System.out.println(total);
    }

}
