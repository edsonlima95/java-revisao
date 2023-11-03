package JLambas;

import java.util.List;
import java.util.function.Consumer;

public class Principal02Consumer {

    public static void main(String[] args) {

        Fruta[] arrayDeFrutas = {new Fruta("banana",3.00, true)};

        List<Fruta> frutas = List.of(arrayDeFrutas);

        /**
         * Comsumer não tem retorno, isto é podemos armazenar tbm em variaveis e passar
         * como parametro para forEach.
         */
        Consumer<Fruta> listaDeFrutas = (fruta -> System.out.println(fruta.getNome()));
        
        frutas.forEach(listaDeFrutas);

    }

}
