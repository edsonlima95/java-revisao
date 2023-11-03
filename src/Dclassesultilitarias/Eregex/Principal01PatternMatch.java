package Dclassesultilitarias.Eregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal01PatternMatch {

    public static void main(String[] args) {

        String regex = "ab";
        String text = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Regex: " + regex);
        System.out.println("Texto: " + text);
        System.out.println("Indices: " + "0 1 2 3 4 5 6...");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }

    }

}
