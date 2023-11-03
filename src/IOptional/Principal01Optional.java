package IOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Principal01Optional {

    public static void main(String[] args) {

        List<String> pessoas = new ArrayList(List.of("maria", "edson"));

        Optional<String> nome = Optional.ofNullable(buscaPorNome(pessoas, "edson"));

        //Se encontrar faz alguma coisa.
        nome.ifPresent(s -> System.out.println(s.toUpperCase()));

        //Se não encontrar retorna alguma coisa no lugar.
        String retornaAlguamCosa = nome.orElse("RETORNA ALGUAM COSA");

        System.out.println("Resultado " +nome);
        System.out.println(retornaAlguamCosa);
    }

    public static String buscaPorNome(List<String> lista, String nome) {

        int index = lista.indexOf(nome);

        if (index != -1) {
            return lista.get(index);
        }

        return null;
    }

}
