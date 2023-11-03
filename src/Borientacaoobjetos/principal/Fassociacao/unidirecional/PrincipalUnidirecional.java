package Borientacaoobjetos.principal.Fassociacao.unidirecional;

import Borientacaoobjetos.classes.Fassociacao.unidirecional.Empresa;
import Borientacaoobjetos.classes.Fassociacao.unidirecional.Funcionario;

public class PrincipalUnidirecional {

    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("joão");
        Funcionario func2 = new Funcionario("pedro");

        Funcionario[] funcionarios = {func1, func2};

        Empresa empresa1 = new Empresa("Google", funcionarios);

        System.out.println(func1.getNome());
        empresa1.imprimir();

    }

}
