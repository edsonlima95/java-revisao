package KStreams;

import KStreams.classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal02ForEach {

    public static void main(String[] args) {


        //Criando a lista de produtos
        List<Produto> produtoList = new ArrayList(List.of(
                new Produto("café", 3.50),
                new Produto("arroz", 5.80),
                new Produto("oleo", 7.00),
                new Produto("picanha", 33.50),
                new Produto("milho", 10.00)
        ));


        produtoList.stream().forEach(System.out::println); //Só imprime

        System.out.println("-----------------------------");

        produtoList.stream()
                .filter(produto -> produto.getPreco() < 8.00)//Filtra
                .forEach(System.out::println); //Imprime

    }

}
