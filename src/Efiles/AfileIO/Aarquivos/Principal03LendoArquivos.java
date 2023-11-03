package Efiles.AfileIO.Aarquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal03LendoArquivos {

    public static void main(String[] args) {

        File file = new File("arquivos\\teste.txt");

        try (Scanner ler = new Scanner(file)) {//Passa o arquivo para leitura.

            while (ler.hasNextLine()) {
                String data = ler.nextLine(); //Ler linha por linha
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("------------COM FILEREADER-------------");
        /**
         * BufferReader - é mais usado em arquivos muitos grandes por questões de performance, pois ele
         * salva primeiro em uma especie de cache, e depois que escreve no arquivo.
         */

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {//Passa o arquivo para leitura.

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
