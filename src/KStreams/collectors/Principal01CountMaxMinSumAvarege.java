package KStreams.collectors;

import KStreams.classes.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Principal01CountMaxMinSumAvarege {

    public static void main(String[] args) {

        //Criando a lista de produtos
        List<Produto> produtos = new ArrayList(List.of(
                new Produto("café", 3.50),
                new Produto("arroz", 5.80),
                new Produto("picanha", 33.50),
                new Produto("milho", 10.00)
        ));

        System.out.println("----------COUNT---------------");
        //Com stream e count
        System.out.println(produtos.stream().count());

        //Com stream e collector
        System.out.println(produtos.stream().collect(Collectors.counting()));

        System.out.println("----------MAX---------------");
        produtos.stream().max(Comparator.comparing(Produto::getPreco)).ifPresent(System.out::println);

        produtos.stream().collect(Collectors.maxBy(Comparator.comparing(Produto::getPreco))).ifPresent(System.out::println);

        System.out.println("----------MIN---------------");
        produtos.stream().min(Comparator.comparing(Produto::getPreco)).ifPresent(System.out::println);

        produtos.stream().collect(Collectors.minBy(Comparator.comparing(Produto::getPreco))).ifPresent(System.out::println);

        System.out.println("----------AVERAGE---------------");
        produtos.stream().mapToDouble(Produto::getPreco).average().ifPresent(System.out::println);

        System.out.println(produtos.stream().collect(Collectors.averagingDouble(Produto::getPreco)));

        System.out.println("----------SUM---------------");
        double sum = produtos.stream().mapToDouble(Produto::getPreco).sum();
        System.out.println(sum);

        Double suma = produtos.stream().collect(Collectors.summingDouble(Produto::getPreco));
        System.out.println(suma);

        System.out.println("----------TODAS AS OPERAÇÕES---------------");
        DoubleSummaryStatistics resultado = produtos.stream().collect(Collectors.summarizingDouble(Produto::getPreco));
        System.out.println(resultado);
    }

}
