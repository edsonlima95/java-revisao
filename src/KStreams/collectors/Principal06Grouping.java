package KStreams.collectors;

import KStreams.classes.Categoria;
import KStreams.classes.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Principal06Grouping {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList(List.of(
                new Produto("café", 3.50, Categoria.BEBIDA),
                new Produto("arroz", 5.80, Categoria.COMIDA),
                new Produto("refri", 7.00, Categoria.BEBIDA),
                new Produto("picanha", 33.50, Categoria.COMIDA),
                new Produto("redbull", 10.00, Categoria.BEBIDA)
        ));

        //Agrupa por categoria e faz o map por produtos menor que 10, toSet()
        Map<Categoria, Set<String>> collect = produtos.stream().collect(
                Collectors.groupingBy(Produto::getCategoria,
                        Collectors.mapping(produto -> produto.getPreco() <= 10.00 ? "PROMOÇÃO" : "PREÇO NORMAL",
                                Collectors.toSet()))
        );

        System.out.println(collect);

    }

}
