package Efiles.AfileIO.Aarquivos;

import java.io.File;
import java.io.IOException;

public class Principal04RenomeaArquivos {

    public static void main(String[] args) {

        File arquivo = new File("arquivos\\teste2.txt");
        File arquivoRenomeado = new File("arquivos\\testerenomeado");

        try {
            boolean newFile = arquivo.createNewFile();
            System.out.println("Arquivo criado: " + newFile);

            boolean renomeado = arquivo.renameTo(arquivoRenomeado);
            System.out.println("Arquivo renomeado: " + renomeado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
