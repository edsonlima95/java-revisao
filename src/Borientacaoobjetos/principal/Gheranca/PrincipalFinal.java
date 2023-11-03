package Borientacaoobjetos.principal.Gheranca;

import Borientacaoobjetos.classes.Gheranca.Automovel;
import Borientacaoobjetos.classes.Gheranca.Carro;

public class PrincipalFinal {

    public static void main(String[] args) {

        Automovel automovel = new Automovel();

        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");

        carro.imprimirMarca();
        carro.imprimir();


    }

}
