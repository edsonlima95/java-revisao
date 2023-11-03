package Borientacaoobjetos.principal.Aparametros;

import Borientacaoobjetos.classes.Aparametros.ParametrosReferencia;
import Borientacaoobjetos.classes.Aparametros.ParametrosReferenciaImprimir;

public class PrincipalParametrosReferencia {

    public static void main(String[] args) {

        ParametrosReferencia pessoa1 = new ParametrosReferencia();
        ParametrosReferencia pessoa2 = new ParametrosReferencia();
        ParametrosReferenciaImprimir tipoImprimir = new ParametrosReferenciaImprimir();

        pessoa1.nome = "Edson";
        pessoa1.idade = 21;

        pessoa2.nome = "Maria";
        pessoa2.idade = 31;

        /**
         * A primeira vez vai imprimir o nome e a idade correta, pois no tempo de
         * execução do metodo
         * os valores setados primeiros permance ate o metodo ser finalizado.
         */

        tipoImprimir.mostrar(pessoa1);

        tipoImprimir.mostrar(pessoa2);

        System.out.println("-------------SEGUNDA CHAMADA-----------------");

        /**
         * A segunda vez vai imprimir o nome que foi alterado dentro do metodo mostrar
         * "Banana", pq
         * quando o metodo e chamado a primeira vez logo após o metodo terminar sua
         * execução
         * a variavel nome é limpada e em seguida, e setada como banana seu novo valor.
         */

        tipoImprimir.mostrar(pessoa1);

        tipoImprimir.mostrar(pessoa2);

        System.out.println("-------------TERCEIRA COM THIS-----------------");

        pessoa1.nome = "Carlos";
        pessoa1.idade = 21;

        pessoa2.nome = "Pedro";
        pessoa2.idade = 31;

        pessoa1.imprimir();
        pessoa2.imprimir();
        

    }
}
