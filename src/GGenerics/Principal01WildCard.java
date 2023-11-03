package GGenerics;

import Borientacaoobjetos.classes.Gheranca.Pessoa;
import GGenerics.classes.Animal;
import GGenerics.classes.Cachorro;
import GGenerics.classes.Gato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal01WildCard {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("pastor alemão");
        Gato gato = new Gato("preto");

        List<Animal> animalList = Arrays.asList(cachorro, gato);
        imprimir(animalList);

        List<Animal> animais = new ArrayList<>();
        imprimir2(animais);


        System.out.println("------------------");

    }

    public static void imprimir(List<? extends Animal> animais){
        for (Animal animal : animais) {
            animal.fazerBarulho();
        }
    }

    public static void imprimir2(List<? super Animal> animais){

        Animal cachorro = new Cachorro("husky");
        Animal gato = new Cachorro("Cianes");

        animais.add(cachorro);
        animais.add(gato);

        System.out.println(animais);
    }
}
