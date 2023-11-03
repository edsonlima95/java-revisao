package Dclassesultilitarias.Fscanner;

import java.util.Scanner;

public class PrincipalScanner {

    public static void main(String[] args) {

        String text = "edson, maria, true, 100";

        System.out.println("-------COM SCANNER--------");

        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(", ");

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                System.out.println("Numeros: " + numero);
            } else if (scanner.hasNextBoolean()) {
                boolean bool = scanner.nextBoolean();
                System.out.println("Boolean: " + bool);
            } else {
                System.out.println(scanner.next());
            }

        }

        System.out.println();
        System.out.println("-------SPLIT--------");

        //Com split não tem como separar por tipo como no scanner.

        String[] dados = text.split(", ");

        for (String dado : dados) {
            System.out.println(dado);
        }


    }

}
