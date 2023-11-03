package Efiles.AfileIO.Aarquivos;

import java.io.File;
import java.io.IOException;

public class Principal01CriaNovoArquivo {

    public static void main(String[] args) {


        //Cria uma instância da classe File
        File file = new File("arquivos\\teste.txt");

        System.out.println(file.getPath()); //Cainho/nome arquivo
        System.out.println(file.getAbsoluteFile());//Caminho completo
        System.out.println(file.getName());//Nome do arquivo
        System.out.println(file.exists()); //se existe
        System.out.println(file.isDirectory());//se é um diretório
        System.out.println(file.isFile());//Se é um arquivo.
        System.out.println(file.isHidden());//Se é oculto.

        try {
            if (!file.exists()) {
                boolean criado = file.createNewFile();//Cria um novo arquivo
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
