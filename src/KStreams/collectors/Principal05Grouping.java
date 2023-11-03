package KStreams.collectors;

import KStreams.classes.Categoria;
import KStreams.classes.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Principal05Grouping {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList(List.of(
                new Produto("café", 3.50, Categoria.BEBIDA),
                new Produto("arroz", 5.80, Categoria.COMIDA),
                new Produto("refri", 7.00, Categoria.BEBIDA),
                new Produto("picanha", 33.50, Categoria.COMIDA),
                new Produto("redbull", 10.00, Categoria.BEBIDA)
        ));

        //Agrupando por categoria, e retornando o max, min, count, average e sum.
        Map<Categoria, DoubleSummaryStatistics> count = produtos.stream().collect(
                Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summarizingDouble(Produto::getPreco))
        );//Fim do collect

        System.out.println(count);

    }

}
