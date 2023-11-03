package Efiles.BfileNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Principal08ZipOutPutStream {

    public static void main(String[] args) {

        Path arquivosParaZipar = Paths.get("arquivos");//Caminho dos arquivos que serão zipados
        Path arquivosZipado = Paths.get("diretorio/arquivos.zip");//Caminho ao será salvo os arquivos zipados

        zip(arquivosZipado, arquivosParaZipar);
    }

    private static void zip(Path caminhoZipados, Path caminhoArquivosParaZipar) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(caminhoZipados));
             DirectoryStream<Path> stream = Files.newDirectoryStream(caminhoArquivosParaZipar)) {

            for (Path file : stream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());//Cria a entrada.
                zipOutputStream.putNextEntry(zipEntry); //Adiciona a entrada.
                Files.copy(file, zipOutputStream); //Copia o conteudo dos arquivos.
                zipOutputStream.closeEntry();
            }

            System.out.println("Arquivos zipados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
