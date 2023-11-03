package Borientacaoobjetos.principal.Aparametros;

import Borientacaoobjetos.classes.Aparametros.ParametrosArgs;

public class PrincipalParametrosArgs {

    public static void main(String[] args) {

        ParametrosArgs calculadora = new ParametrosArgs();

        calculadora.somar(new int[] { 1, 2, 3, 4 });

        System.out.println("----------------------");

        //Ao invés de passa um array, podemos passar apenas os valores.
        calculadora.multiplicar(1, 2, 3, 5);

    }

}
