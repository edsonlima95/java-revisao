package FCollections.Cmaps;

import java.util.HashMap;
import java.util.Map;

public class Principal01HashMap {

    public static void main(String[] args) {

        /**
         * Não permite keys duplicados, mas podemos inserir valores duplicados, a ordem
         * de inserção não importa.
         */

        Map<String, String> nomes = new HashMap<>();

        //Adiciona chaves e valores com o metodo PUT
        nomes.put("bonito","edson");
        nomes.put("corajoso","joão");
        nomes.put("feio","maria");
        nomes.put("medroso","pedro");
        //nomes.put("bonito","edson2"); //mesma chave Sobrescreve o valor
        //nomes.putIfAbsent("bonito","edson2"); //mesma chave mas não sobresve o valor

        //Iterando sobre as chaves
        for (String chave : nomes.keySet()) {
            System.out.println(chave + " - " + nomes.get(chave));
        }

        System.out.println("--------------------------");

        //Iterando sobre valores
        for (String valor : nomes.values()) {
            System.out.println(valor);
        }

    }
}
