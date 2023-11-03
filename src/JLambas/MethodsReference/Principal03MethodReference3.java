package JLambas.MethodsReference;

import java.util.function.BiFunction;

public class Principal03MethodReference3 {

    public static void main(String[] args) {

        /**
         * Criando um objeto com construtor com Lambda.
         */

        BiFunction<String, Integer, Pessoa> pessoa = Pessoa::new;

        Pessoa edson = pessoa.apply("edson", 21);

        System.out.println(edson);
    }
}
