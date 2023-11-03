package Dclassesultilitarias.Astrings.Bmetodosultils;

public class Equals {

    public static void main(String[] args) {

        /**
         * Compara se duas strings são iguais.
         */

        String text = "java";
        String text2 = "JAVA";

        System.out.println(text.equals(text2));//false

        System.out.println(text.equalsIgnoreCase(text2));//true

    }

}
