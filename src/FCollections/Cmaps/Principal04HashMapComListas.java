package FCollections.Cmaps;

import FCollections.Cmaps.classes.Consumidor;
import FCollections.Cmaps.classes.Produto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal04HashMapComListas {

    public static void main(String[] args) {

        Map<Consumidor, List<Produto>> compras = new HashMap();

        Consumidor consumidor1 = new Consumidor("edson");
        Consumidor consumidor2 = new Consumidor("joão");

        Produto p1 = new Produto("Curso de java");
        Produto p2 = new Produto("Curso de react");
        Produto p3 = new Produto("Curso de css");
        Produto p4 = new Produto("Curso de html");

        List<Produto> listaConsumidor1 = Arrays.asList(p1, p2);
        List<Produto> listaConsumidor2 = Arrays.asList(p3, p4);

        compras.put(consumidor1, listaConsumidor1);
        compras.put(consumidor2, listaConsumidor2);

        for (Map.Entry<Consumidor, List<Produto>> produtos : compras.entrySet()){
            System.out.println("Consumidor: " + produtos.getKey().getNome());
            System.out.println("---------------Produtos----------------");
            for (Produto produto : produtos.getValue()) {
                System.out.println("nome: " + produto.getNome());
            }

            System.out.println();
        }
    }
}
