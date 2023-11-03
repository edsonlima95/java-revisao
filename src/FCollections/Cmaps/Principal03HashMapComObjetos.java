package FCollections.Cmaps;

import FCollections.Cmaps.classes.Consumidor;
import FCollections.Cmaps.classes.Produto;

import java.util.HashMap;
import java.util.Map;

public class Principal03HashMapComObjetos {

    public static void main(String[] args) {

        Map<Consumidor, Produto> compras = new HashMap();

        Consumidor consumidor1 = new Consumidor("edson");
        Consumidor consumidor2 = new Consumidor("joão");

        Produto p1 = new Produto("Curso de java");
        Produto p2 = new Produto("Curso de react");

        compras.put(consumidor1, p1);
        compras.put(consumidor2, p2);

        for (Map.Entry<Consumidor, Produto> produtos : compras.entrySet()){
            System.out.println("Consumidor: " + produtos.getKey().getNome() +
                    " produto: " + produtos.getValue().getNome());
        }
    }
}
