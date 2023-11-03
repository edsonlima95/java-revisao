package Cexcecoes.checked;

import java.io.File;

/**
 *
 * Exceções do tipo checked que sao "filhas direta de Exception" são obrigatóriamente ser
 * tratada, caso contrário um erro de compilação é mostrado.
 *
 */

public class ExemploIOException {

    public static void main(String[] args) {

        createFile();

    }

    /**
     * Se colocar o metodo explicito que vai lançar throws IOException, não precisa
     * colocar o bloco try pois quem chamar esse metodo que irá ter essa responsabilidade.
     *
     *  public static void createFile() throws IOException {}
     */
    public static void createFile()  {

        try {
            File file = new File("arquivos\\texto.txt");
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
