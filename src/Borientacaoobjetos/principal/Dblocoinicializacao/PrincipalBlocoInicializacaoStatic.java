package Borientacaoobjetos.principal.Dblocoinicializacao;

import Borientacaoobjetos.classes.Dblocoinicializacao.BlocoInicializacaoStatico;

public class PrincipalBlocoInicializacaoStatic {

    public static void main(String[] args) {

        BlocoInicializacaoStatico bloco = new BlocoInicializacaoStatico();
        BlocoInicializacaoStatico bloco2 = new BlocoInicializacaoStatico();
        BlocoInicializacaoStatico bloco3 = new BlocoInicializacaoStatico();

        System.out.println(BlocoInicializacaoStatico.getNumeros());

    }

}
