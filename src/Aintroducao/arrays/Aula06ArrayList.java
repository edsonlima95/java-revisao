package Aintroducao.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula06ArrayList {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        //Adiciona items.
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Lamborgine");

        //Acessa um item.
        System.out.println("Posição 0: " + cars.get(0)); //BMW

        //Muda um item.
        cars.set(0, "Opala");
        System.out.println("Posição mudada: " + cars.get(0)); //Opala

        //Remove um item.
        cars.remove(2);
        System.out.println("Items: " + cars.toString());

        //Verifica o tamanho.
        System.out.println("Tamanho: " + cars.size());

        //Percorre o array.
        for (String car : cars) {
            System.out.print(car + " ");
        }

    }

}
