package Cexcecoes.blocotrycatch;

import java.sql.SQLException;

/**
 * Bloco finally e sempre usando quando precisamos abrir e fechar um recurso.
 * ex: conexão com banco, leitura e escrita de arquivos.
 */

public class ExemploBlocoFinally {

    public static void main(String[] args) {
        conexao();
    }

    private static void conexao(){

        try {
            System.out.println("Abre a conexão.");

            System.out.println("Faz a logica, salvar, editar etc");

        }catch (Exception e){
            //Exibe o erro.
            e.printStackTrace();
        }finally { //Este bloco e sempre executado caso tenha error ou não.
            System.out.println("Aqui fecha a conexão dando erro ou não");
        }

    }

}
