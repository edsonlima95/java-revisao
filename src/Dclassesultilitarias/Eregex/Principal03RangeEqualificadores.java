package Dclassesultilitarias.Eregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal03RangeEqualificadores {

    public static void main(String[] args) {

        /**
         * Ranges fica entre []
         * ex: [a-zA-Z] busca tudo que for letras minusculas e maiusculas.
         *
         * QUALIFICADORES
         * ? Zero ou uma ocorrência
         * * zero ou mais
         * + uma ou mais
         * {n,M} de n até m
         * () grupo
         * | ou
         * $ fim da linha
         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String text = "abc_12 DE345hij@*#";
        String text = "12 0x 0X 0x1 0XFFED 0X10G 0X1";

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
