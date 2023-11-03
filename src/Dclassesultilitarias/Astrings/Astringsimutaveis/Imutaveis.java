package Dclassesultilitarias.Astrings.Astringsimutaveis;

public class Imutaveis {

    public static void main(String[] args) {

        /**
         * Strings são imutávseis, toda vez que uma string é criada ela é adicionada na memoria na parte de
         * pool de strings.
         */

        String nome = "edson";
        String nome2 = "edson";

        System.out.println(nome == nome2); //true, aponta para mesma string no pool de strings.

        System.out.println("----------------------------");

        nome.concat(" Lima"); //Cria uma nova string Lima, e outra edson Lima
        System.out.println(nome);
        System.out.println(nome == nome2);

        System.out.println("----------------------------");

        nome = nome.concat(" Lima"); //Cria uma nova string Lima, e outra edson Lima e referencia a nome.
        System.out.println(nome); //Saida: edson Lima
        System.out.println(nome == nome2); //False.

        System.out.println("----------------------------");

        String nome3 = new String("edson");//Cria uma instância, fora do pool que aponta pro pool.
        System.out.println(nome3);
        System.out.println(nome3 == nome2);//false

        System.out.println();

        System.out.println(nome3.intern() == nome2); //true, acessa a string interna dentro do pool.

    }

}
