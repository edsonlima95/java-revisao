package Efiles.AfileIO.Aarquivos;

import java.io.File;
import java.io.IOException;

public class Principal05RemoveArquivos {

    public static void main(String[] args) {

        File file = new File("arquivos\\teste2.txt");

        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("Arquivo criado");
            }

            System.out.println("Arquivo deletado: " + file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
