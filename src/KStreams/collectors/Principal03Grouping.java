package KStreams.collectors;

import KStreams.classes.Categoria;
import KStreams.classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal03Grouping {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList(List.of(
                new Produto("café", 3.50, Categoria.BEBIDA),
                new Produto("arroz", 5.80, Categoria.COMIDA),
                new Produto("refri", 7.00, Categoria.BEBIDA),
                new Produto("picanha", 33.50, Categoria.COMIDA),
                new Produto("redbull", 10.00, Categoria.BEBIDA)
        ));

        //Usando uma expressao lambda e agrupando pelo preço menor que 10.
        Map<String, List<Produto>> promocao = produtos.stream().collect(Collectors.groupingBy(produto -> produto.getPreco() <= 10.00 ? "PROMOÇÃO" : "PREÇO NORMAL"));

        System.out.println(promocao);

        System.out.println();
        System.out.println("-----------------------------");

        //Agrupando por categoria e por preço menor que 10.
        Map<Categoria, Map<String, List<Produto>>> agrupaCategoriaPromocao =
                produtos.stream().collect(
                        Collectors.groupingBy(Produto::getCategoria,
                                Collectors.groupingBy(produto -> produto.getPreco() <= 10.00 ? "PROMOÇÃO" : "PREÇO NORMAL")));

        System.out.println(agrupaCategoriaPromocao);


    }

}
