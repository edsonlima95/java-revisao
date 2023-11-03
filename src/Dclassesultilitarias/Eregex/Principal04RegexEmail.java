package Dclassesultilitarias.Eregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal04RegexEmail {

    public static void main(String[] args) {

        /**
         * 1 -
         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z0-9])+)+";
        //String text = "abc_12 DE345hij@*#";
        String text = "teste@gmail.com, 123teste@mail.br, @#$teste@hotmail.com.br";

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
