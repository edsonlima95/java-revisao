package KStreams;

import java.util.List;

public class Principal05Reducer {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        System.out.println("----------SOMA-------------");
        //Somando todos os numeros.
        numeros.stream().reduce((n1, n2) -> n1 + n2).ifPresent(System.out::println); //15
        System.out.println(numeros.stream().reduce(0, Integer::sum)); //15

        System.out.println("----------MULTIPLICA-------------");

        //Forma reduzida.
        numeros.stream().reduce((n1, n2) -> n1 * n2).ifPresent(System.out::println); //120
        System.out.println(numeros.stream().reduce(1, (n1, n2) -> n1 * n2)); //120

        System.out.println("----------MAX E MIN-------------");

        System.out.println(numeros.stream().reduce(0, Integer::max)); //5
        System.out.println(numeros.stream().reduce(0, Integer::min)); //0

    }

}
