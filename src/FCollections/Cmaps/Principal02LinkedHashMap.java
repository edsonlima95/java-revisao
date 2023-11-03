package FCollections.Cmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Principal02LinkedHashMap {

    public static void main(String[] args) {

        /**
         * Não permite keys duplicados, mas podemos inserir valores duplicados e a ordem
         * de inserção importa.
         */

        Map<String, String> nomes = new LinkedHashMap<>();

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
