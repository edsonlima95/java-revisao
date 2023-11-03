package Efiles.BfileNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal01Introducao {

    public static void main(String[] args) throws IOException {

        //Passa o nome do diretorio.
        Path diretorio = Paths.get("pastacomNIO");

        if (Files.notExists(diretorio)) {
            Path pastaCriada = Files.createDirectory(diretorio);//Cria um novo diretorio.
        }

        //Cria arquivo dentro do diretorio criado "pastacomNIO".
        Path novoArquivo = Paths.get(diretorio.toString(), "arquivo.txt");//Salva novo arquivo.

        if (Files.notExists(novoArquivo)) {
            Files.createFile(novoArquivo);
        }

        //Cria subpastas
        Path diretorios = Paths.get("diretorio\\subdiretorio\\subsubdiretorio");
        Path subDiretorios = Files.createDirectories(diretorios);

        //Cria arquivo dentro de um subdiretorio.
        Path novoArquivo2 = Paths.get(subDiretorios.toString(), "novoarquivo.txt");

        if (Files.notExists(novoArquivo2)) {
            Files.createFile(novoArquivo2);
        }

        //Copiando um arquivo
        Path copiaArquivo = Paths.get(diretorio.toString(), "arquivo_copiado.txt");
        Files.copy(novoArquivo, copiaArquivo);

    }

}
