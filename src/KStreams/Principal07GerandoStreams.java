package KStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal07GerandoStreams {

    public static void main(String[] args) {

        System.out.println("----------------RANGE INTEIROS-----------------");

        //Gerando numeros inteiros.
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));//1 até 48.

        System.out.println();

        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));//1 até 50.



        System.out.println("----------------STRINGS-----------------");

        //Gerando streams de strings com metodo of
        Stream.of("joão", "maria", "josé")
                .map(String::toUpperCase)
                .forEach(System.out::println);




        System.out.println("----------------ARRAYS-----------------");

        //Gerando streams através de arrays.
        Integer[] numeros = {10,20,30,40};

        Arrays.stream(numeros).forEach(System.out::println);




        System.out.println("---------------FILES LINES----------------");

        //Gerando streams através de arquivos.
        try(Stream<String> linhas = Files.lines(Paths.get("file.txt"))){

            linhas.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }




        System.out.println("---------------ITERARTE----------------");

        Stream.iterate(1, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);




        System.out.println("---------------RANDOM----------------");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 100))
                .limit(10)
                .forEach(System.out::print);

    }
}
