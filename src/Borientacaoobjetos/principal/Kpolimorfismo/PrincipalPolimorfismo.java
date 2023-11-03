package Borientacaoobjetos.principal.Kpolimorfismo;

import Borientacaoobjetos.classes.Kpolimorfismo.Computador;
import Borientacaoobjetos.classes.Kpolimorfismo.Impressora;
import Borientacaoobjetos.classes.Kpolimorfismo.servicos.CalcularImpostos;

public class PrincipalPolimorfismo {

    public static void main(String[] args) {

        Computador computador = new Computador("Notebook nitro 5", 4000);
        Impressora impressora = new Impressora("Epson L375", 1000, "Multifuncional");

        CalcularImpostos.calcularImpostosComputador(computador);
        CalcularImpostos.calcularImpostosComputador(impressora);

    }
}
