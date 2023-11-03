package Efiles.BfileNIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal03Resolver {

    public static void main(String[] args) {

        /**
         * Path relativo e quando não tem a / antes do diretorio principal.
         * ex: home/edson/dev
         *
         * Path absoluto é quando tem a / assim ele vai pegar da pasta principal do projeto.
         */

        Path pathRelativo = Paths.get("diretorio/subdiretorio");
        Path pathRelativo2 = Paths.get("subsubdiretorio/novoarquivo.txt");

        Path resolve = pathRelativo.resolve(pathRelativo2);

        System.out.println(resolve);
        System.out.println(Files.exists(resolve));

        System.out.println("-----------------------------");

        //Quando o path for absoluto com a /, ele ignora o resolve relativo e nao resolve.
        Path pathAbsolute = Paths.get("/diretorio/subdiretorio");
        Path pathRelativo4 = Paths.get("subsubdiretorio/novoarquivo.txt");

        Path absolute2 = pathRelativo.resolve(pathAbsolute);

        System.out.println(absolute2);

    }

}
