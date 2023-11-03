package Borientacaoobjetos.principal.Aparametros;

import Borientacaoobjetos.classes.Aparametros.ParametrosPrimitivos;

public class PrincipalParametrosPrimitivos {
    public static void main(String[] args) {
        
        ParametrosPrimitivos tipoPrimitivo = new ParametrosPrimitivos();

        int num1 = 1;
        int num2 = 2;

        tipoPrimitivo.somar(num1, num2);

        System.out.println("Dentro da classe principal: " + " num1 = " + num1 + " num2 = " + num2);

    }
}
