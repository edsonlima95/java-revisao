package FCollections.Cmaps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Principal05NavigableMapTreeMap {

    public static void main(String[] args) {

        /**
         * TreeMap - Ordena a lista pelas chaves, é do tipo sort ou seja
         * só aceita dados comparable ou comparator.
         */

        NavigableMap<String, String> alfabeto = new TreeMap<>();

        alfabeto.put("A","Letra a");
        alfabeto.put("D","Letra d");
        alfabeto.put("G","Letra g");
        alfabeto.put("F","Letra f");
        alfabeto.put("E","Letra e");

        for (Map.Entry<String,String> letras : alfabeto.entrySet()){
            System.out.println(letras);
        }
    }
}
