package Borientacaoobjetos.classes.Iabstratas;

public class Desenvolvedor extends Funcionario {

    private String especialidade;

    public Desenvolvedor(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    @Override
    public double calcularAcrescimo() {
        return this.salario += this.salario * 0.1; //10%
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "  nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

}
