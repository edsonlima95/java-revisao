package Cexcecoes.blocotrycatch;

import java.io.*;

public class ExemploTryComResources {

    public static void main(String[] args) {
        lerArquivo();

        System.out.println("---------------------------");

        lerArquivo2();
    }

    /**
     * Este try ele tem uma classe do tipo Closeable ou seja que precisa de ser fechado
     * seu recurso ao ser aberto neste caso a leitura de arquivos.
     */
    public static void lerArquivo() {

        Reader reader = null;

        try {

            reader = new BufferedReader(new FileReader("arquivo\\teste.txt"));
            System.out.println("Leu o arquivo...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Fechou");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Usando o try com resource ele efetua a ação e ja fecha em seguida o recurso
     * Esta abordagem so funciona com subclasses filhas de Closeable e autocloseable
     */
    public static void lerArquivo2() {

        try (Reader reader = new BufferedReader(new FileReader("arquivo\\teste.txt"));) {
            System.out.println("Leu o arquivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
