package Borientacaoobjetos.classes.Gheranca;

/**
 * Funcionário "é" uma Pessoa, tudo que tiver na classe Pessoa funcionario tem acesso.
 *
 * O super é como se fosse um this, para classes que herdão, podemos acessar qualquer coisa
 * da classe pai pelo super.
 */

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir(); //Metodo imprimir da classe Pessoa.
        System.out.println("Salário: " + this.salario);
    }

    public void relatorio(){
        System.out.println("Relatorio: " + this.nome + " idade: " + this.idade);
    }

}
