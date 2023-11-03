package Cexcecoes.unchecked;

/**
 *
 * Exceções do tipo unchecked que são "Filha de RunTimeException" não são obrigatóriamente ser
 * tratada com try catch, ao invés podemos lançar uma exceção com o throw new Exception.
 */

public class ExemploRuntimeException {

    public static void main(String[] args) {

        System.out.println(dividePorZero(10, 2));

        System.out.println("Continue...");
    }

    public static int dividePorZero(int a, int b) {

        if (a == 0 || b == 0) {
            throw new IllegalArgumentException(""); //Trava o codigo caso tenha exceção.
        }

        return  (a / b);
    }

}
