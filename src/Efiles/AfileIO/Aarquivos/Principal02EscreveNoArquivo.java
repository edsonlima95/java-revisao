package Efiles.AfileIO.Aarquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal02EscreveNoArquivo {

    public static void main(String[] args) {

        File file = new File("arquivos\\teste.txt");


        try (FileWriter fileWriter = new FileWriter(file)) {

            if (file.exists()) {
                fileWriter.write("Adicionando um texto dentro do arquivo");
                fileWriter.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        /**
         * BufferWrite - é mais usado em arquivos muitos grandes por questões de performance, pois ele
         * salva primeiro em uma especie de cache, e depois que escreve no arquivo.
         */

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            if (file.exists()) {
                bufferedWriter.write("Adicionando um texto dentro do arquivo com bufferwriter");

                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
