package Borientacaoobjetos.classes.Dblocoinicializacao;

public class BlocoInicializacaoStatico {

    private static int[] numeros = new int[10];

    //Blocos static são executado apenas uma vez.
    static {
        System.out.println("Bloco de inicialização static iniciado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    }

    //Blocos normais são executado toda vez que um objeto for criado.
    /*{
        System.out.println("Bloco de inicialização iniciado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    }*/

    public BlocoInicializacaoStatico() {
        for (int numero : BlocoInicializacaoStatico.numeros) {
            System.out.print(numero);
        }
        System.out.println();
    }

    public static int[] getNumeros() {
        return numeros;
    }

    public static void setNumeros(int[] numeros) {
        BlocoInicializacaoStatico.numeros = numeros;
    }
}
