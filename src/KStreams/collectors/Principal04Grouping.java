package KStreams.collectors;

import KStreams.classes.Categoria;
import KStreams.classes.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Principal04Grouping {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList(List.of(
                new Produto("café", 3.50, Categoria.BEBIDA),
                new Produto("arroz", 5.80, Categoria.COMIDA),
                new Produto("refri", 7.00, Categoria.BEBIDA),
                new Produto("picanha", 33.50, Categoria.COMIDA),
                new Produto("redbull", 10.00, Categoria.BEBIDA)
        ));

        //Contando os produtos por categoria.
        Map<Categoria, Long> count = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));

        System.out.println(count);

        System.out.println();
        System.out.println("-----------------------------");

        //Agrupa por categoria os produtos de valor maior.
        Map<Categoria, Optional<Produto>> agrupaCategoriaPromocao =
                produtos.stream().collect(
                        Collectors.groupingBy(Produto::getCategoria,
                                Collectors.maxBy(Comparator.comparing(Produto::getPreco))));

        System.out.println(agrupaCategoriaPromocao);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        ////Agrupa por categoria os produtos de valor maior, sem o optional como retorno.
        Map<Categoria, Produto> collect = produtos.stream().collect(
                Collectors.groupingBy(Produto::getCategoria,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Produto::getPreco)),
                                Optional::get)));

        System.out.println(collect);


    }

}
