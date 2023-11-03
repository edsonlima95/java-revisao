package Borientacaoobjetos.principal.Fassociacao.bidirecional;

import Borientacaoobjetos.classes.Fassociacao.bidirecional.Jogador;
import Borientacaoobjetos.classes.Fassociacao.bidirecional.Time;

public class PrincipalBidirecional {

    public static void main(String[] args) {


        Jogador jogador1 = new Jogador("Pelé", "Atacante");
        Jogador jogador2 = new Jogador("Lúcio", "Zagueiro");

        Jogador[] jogadores = {jogador1, jogador2};

        Time time = new Time("Brasil", jogadores);

        System.out.println("----JOGADOR----");

        //jogador1.getTime(); //Error: nullPointerException

        jogador1.setTime(time);
        jogador1.imprime();

        jogador2.setTime(time);
        jogador2.imprime();

        System.out.println();
        System.out.println("----TIME----");

        time.imprimir();

    }

}
