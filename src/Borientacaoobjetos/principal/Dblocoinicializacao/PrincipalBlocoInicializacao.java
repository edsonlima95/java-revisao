package Borientacaoobjetos.principal.Dblocoinicializacao;

import Borientacaoobjetos.classes.Dblocoinicializacao.BlocoInicializacao;

public class PrincipalBlocoInicializacao {

    public static void main(String[] args) {

        BlocoInicializacao bloco = new BlocoInicializacao("edson");

        for (int episodio : bloco.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }

}
