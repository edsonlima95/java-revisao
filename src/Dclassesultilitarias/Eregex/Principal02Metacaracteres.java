package Dclassesultilitarias.Eregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal02Metacaracteres {

    public static void main(String[] args) {

        /**
         * \d - Busca por todos os digitos.
         * \D - Tudo que não for digitos.
         * \s = Espaços em brancos e \t \n \f \r
         * \S - Todos os caracteres incluindo os brancos.
         * \w - a-ZA-Z, digitos, _
         * \W - Tudo que não for \w
         *
         */

        String regex = "\\D";
        String text = "abc_12 DE345hij@*#";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Regex: " + regex);
        System.out.println("Texto: " + text);
        System.out.println();

        while (matcher.find()) {
            System.out.print("posição: " + matcher.start() + "    valor:" + matcher.group() + "\n");
        }

    }

}
