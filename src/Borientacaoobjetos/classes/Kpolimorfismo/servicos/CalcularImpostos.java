package Borientacaoobjetos.classes.Kpolimorfismo.servicos;

import Borientacaoobjetos.classes.Kpolimorfismo.Impressora;
import Borientacaoobjetos.classes.Kpolimorfismo.Produto;

public class CalcularImpostos {

    public static void calcularImpostosComputador(Produto produto){

         System.out.println("-----------------------------------------");
         System.out.println();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor original : " + produto.getValor());
        double imposto = produto.calcularTaxa();
        System.out.println("Valor do imposto : " + imposto);

        if(produto instanceof Impressora){
            Impressora impressora = (Impressora) produto;

            System.out.println("Tipo da impressora: " + impressora.getTipo());
        }

    }
}
