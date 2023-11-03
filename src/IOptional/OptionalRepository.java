package IOptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalRepository {

    private static List<Carro> carros = List.of(new Carro(10, "carro1"), new Carro(20, "audi"));

    public static Optional<Carro> findById(Integer id) {
        return findBy(c -> c.getId().equals(id));
    }

    public static Optional<Carro> findByName(String nome) {
        return findBy(c -> c.getNome().equals(nome));
    }

    public static Optional<Carro> findBy(Predicate<Carro> carroPredicate) {

        Carro carro = null;

        for (Carro c : carros) {
            if (carroPredicate.test(c)) {
                carro = c;
            }
        }

        return Optional.ofNullable(carro);
    }

}
