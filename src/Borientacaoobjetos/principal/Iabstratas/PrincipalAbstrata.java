package Borientacaoobjetos.principal.Iabstratas;

import Borientacaoobjetos.classes.Iabstratas.Desenvolvedor;
import Borientacaoobjetos.classes.Iabstratas.Gerente;

public class PrincipalAbstrata {

    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("Edson", "Programador sênior", 20000D,
                "backend");

        Gerente gerente = new Gerente("Maria", "Gerente de projetos", 30000D,
                "Scrum");

        System.out.println(desenvolvedor);
        System.out.println();
        System.out.println(gerente);

    }

}
