package Borientacaoobjetos.principal.EmodificadorStatic;

import Borientacaoobjetos.classes.EmodificadorStatic.Carro;

public class PrincipalModificadorStatic {

    public static void main(String[] args) {

        //Todo carro instânciado terá a velocidade maxima igual.

        Carro c1 = new Carro("BMW");
        Carro c2 = new Carro("Ferrari");

        //Aqui a velocidade é 250 para os dois objetos.
        System.out.println(c1.getMarca());
        System.out.println(c2.getMarca());

        System.out.println("--------------------");

        Carro.setVelocidadeMaxima(1000);

        //Aqui a velocidade é 1000 para os dois objetos.
        System.out.println(c1.getMarca());
        System.out.println(c2.getMarca());


        System.out.println("-------------VALOR ATUALIZADO-------------");
        System.out.println(Carro.getVelocidadeMaxima());
    }
}
