package Efiles.BfileNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal05DirectoryStream {

    public static void main(String[] args) {

        /**
         * Ler todos os arquivos de um diretorio, mas não ler os subdiretorios.
         */

        Path dirRoot = Paths.get(".");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dirRoot)) {

            for (Path arquivos : stream) {
                System.out.println(arquivos.getFileName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
