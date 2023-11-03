package Borientacaoobjetos.classes.Fassociacao.unidirecional;

/**
 * Relacionamento unidirecional apenas um objeto tem conhecimento do outro
 * nesse caso apenas a empresa pode saber quem é os funcionarios.
 */

public class Empresa {

    private String nome;

    //Assossiação unidirecional.
    private Funcionario[] funcionarios;


    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa(String nome, Funcionario[] funcionarios) {
        this(nome);
        this.funcionarios = funcionarios;
    }

    public void imprimir() {
        System.out.println("Empresa: " + this.nome);

        if (this.funcionarios != null) {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Funcionario: " + funcionario.getNome());
            }
        }
    }
}
