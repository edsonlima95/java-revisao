package FCollections.Alistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal03ArrayParaListas {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        //Convertendo de Lista para Array.
        Integer[] arrayNumeros = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayNumeros));

        System.out.println("---------------------------");

        //Convertendo de Array para Lista.
        Integer[] numeros2 = {50, 60, 70, 80}; //[50, 60, 70, 80]

        /**
         * Arrays.asList - cria um link referenciando o array, ou seja
         * tudo que for alterado na Lista também reflete no array original.
         */

        List<Integer> numeros2Lista = Arrays.asList(numeros2);
        numeros2Lista.set(0,99);

        System.out.println(numeros2Lista.toString());//[99, 60, 70, 80]
        System.out.println(Arrays.toString(numeros2));//Array original - [99, 60, 70, 80]



        //Convertendo array para lista sem criar um link de referência.

        Integer[] numeros3 = {1, 2, 3, 4};

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeros3));
        numerosList.add(5);
        System.out.println(numerosList);

    }

}
