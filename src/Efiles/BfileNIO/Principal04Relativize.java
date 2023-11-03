package Efiles.BfileNIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal04Relativize {

    public static void main(String[] args) {

        /**
         * Relativize - ignora as pastas com mesmo nome e aponta o diretorio aonde ir.
         */

        Path diretorio = Paths.get("/diretorio/subdiretorio");
        Path subdiretorio = Paths.get("/diretorio/subdiretorio/subsubdiretorio");

        System.out.println("vá para: "+diretorio.relativize(subdiretorio));

        System.out.println();

        Path absoluto = Paths.get("/diretorio/subdiretorio");
        Path absoluto2 = Paths.get("/usr/local");

        System.out.println("vá pra raiz: " + absoluto.relativize(absoluto2));

    }

}
