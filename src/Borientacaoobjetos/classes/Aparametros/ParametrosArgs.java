package Borientacaoobjetos.classes.Aparametros;

public class ParametrosArgs {

    private String teste;

    /**
     * Opção 01 passando um array.
     */
    public void somar(int[] numeros) {

        int total = 0;

        for (int numero : numeros) {
            total += numero;
        }

        System.out.println("Soma dos numeros total: " + total);

    }

    /**
     * Opção 02 passando a sintáxe moderna.
     */
    public void multiplicar(int... numeros) {
        int total = 1;

        for (int numero : numeros) {
            total *= numero;
        }

        System.out.println("Multiplicação dos numeros total: " + total);
    }

}
