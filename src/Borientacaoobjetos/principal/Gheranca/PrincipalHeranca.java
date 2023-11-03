package Borientacaoobjetos.principal.Gheranca;

import Borientacaoobjetos.classes.Gheranca.Funcionario;
import Borientacaoobjetos.classes.Gheranca.Pessoa;

public class PrincipalHeranca {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Ricardo");

        pessoa1.setIdade(30);

        System.out.println("---Pessoa---");

        pessoa1.imprimir();

        System.out.println();

        System.out.println("---Funcionario---");

        Funcionario func1 = new Funcionario("Maria");

        func1.setIdade(40);
        func1.setSalario(3000.00D);

        func1.imprimir();
        System.out.println();
        func1.relatorio();



    }
}
