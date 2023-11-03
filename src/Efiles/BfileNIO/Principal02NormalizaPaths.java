package Efiles.BfileNIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal02NormalizaPaths {

    public static void main(String[] args) {

        String path = "diretorio/subdiretorio/subsubdiretorio";
        String text = "../../texto.txt";

        Path diretorio = Paths.get(path, text);

        System.out.println(diretorio);
        System.out.println(diretorio.normalize());//Normaliza o caminho.

    }

}
