package IOptional;

import java.util.Optional;

public class Principal02Optional {

    public static void main(String[] args) {

        System.out.println("--------BUSCA POR NOME-----------");
        Optional<Carro> audi = OptionalRepository.findByName("audi");
        System.out.println(audi);

        System.out.println();

        System.out.println("--------BUSCA POR ID-----------");

        Optional<Carro> carro = OptionalRepository.findById(10);

        Carro carro1 = carro.orElseThrow(IllegalArgumentException::new);

        System.out.println(carro1);
    }

}
