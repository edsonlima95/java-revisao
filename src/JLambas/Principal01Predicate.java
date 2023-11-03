package JLambas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal01Predicate {

    public static void main(String[] args) {

        List<Fruta> frutas = List.of(
                new Fruta("maçã", 5.00, true),
                new Fruta("Banana", 10.00, false),
                new Fruta("Uva", 12.00, true));

        List<Fruta> filtroPorPreco = filter(frutas, f -> f.getPreco() >= 10.00);
        List<Fruta> filtroPorEstoque = filter(frutas, f -> f.isEstoque() == true);

        System.out.println(filtroPorPreco);

        System.out.println();

        System.out.println(filtroPorEstoque);

    }

    public static List<Fruta> filter(List<Fruta> frutas, Predicate<Fruta> predicate) {

        List<Fruta> frutasFiltradas = new ArrayList<>();

        for (Fruta fruta : frutas) {
            if (predicate.test(fruta)) {
                frutasFiltradas.add(fruta);
            }
        }
        return frutasFiltradas;
    }

}
