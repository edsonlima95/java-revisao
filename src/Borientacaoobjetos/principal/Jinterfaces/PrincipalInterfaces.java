package Borientacaoobjetos.principal.Jinterfaces;

import Borientacaoobjetos.classes.Jinterfaces.Automovel;
import Borientacaoobjetos.classes.Jinterfaces.Carro;

public class PrincipalInterfaces {

    public static void main(String[] args) {

        Carro bmv = new Carro("BMW 300T");

        System.out.println(bmv);

        bmv.airBarg();

        System.out.println(Carro.VELOCIDADE_MAXIMA);

        System.out.println();

        Automovel.tracao();

    }
}
