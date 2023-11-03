package KStreams;

import KStreams.classes.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal01SortedFilterMap {

    public static void main(String[] args) {

        //Criando a lista de produtos
        List<Produto> produtoList = new ArrayList(List.of(
                new Produto("café", 3.50),
                new Produto("arroz", 5.80),
                new Produto("oleo", 7.00),
                new Produto("picanha", 33.50),
                new Produto("milho", 10.00)
        ));

        //Usando Stream para manipular a lista.

        List<String> nomes = produtoList.stream()
                .sorted(Comparator.comparing(Produto::getNome)) //Ordena por nome
                .filter(produto -> produto.getPreco() < 10.00) //Filtra produtos menor que 10
                .map(Produto::getNome)//Pega o nome do produto
                .collect(Collectors.toList());//Retorna uma lista

        System.out.println(nomes);
    }

}
