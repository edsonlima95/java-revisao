package Dclassesultilitarias.Astrings.Bmetodosultils;

public class Contains {

    public static void main(String[] args) {

        /**
         * Verifica se uma string contem uma determinada string.
         */

        String text = "hello java";

        System.out.println(text.contains("he"));//true

        System.out.println(text.contains("He"));//false

        System.out.println(text.contains("He".toLowerCase()));//true

    }

}
