package Dclassesultilitarias.Astrings.Bmetodosultils;

public class SubString {

    public static void main(String[] args) {

        String text = "estou aprendendo java";

        /**
         * Retorna o resto da string apartir do index 6.
         */
        System.out.println(text.substring(6)); //aprendendo java

        System.out.println("--------------------------");

        /**
         * Retorna o resto da string apartir do index 6 até 15.
         */
        System.out.println(text.substring(6, 16)); //aprendendo

    }
}
