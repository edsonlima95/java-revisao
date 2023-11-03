package Borientacaoobjetos.classes.Aparametros;

public class ParametrosPrimitivos {

    /**
     * Parâmetros do tipo primitivo ou seja int, double etc são passados como copia
     * para o metodo,
     * logo quando dentro metodo o valor e alterado e refleticdo apenas dentro, num1
     * e num2 que vem
     * da classe principal não muda seu valor e continua sendo 1 e 2.
     **/

    public void somar(int num1, int num2) {

        num1 = 10;
        num2 = 20;

        System.out.println("Dentro do metodo: " + " num1 = " + num1 + " num2 = " + num2);

    }

}


