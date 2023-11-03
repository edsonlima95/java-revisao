package Borientacaoobjetos.classes.Iabstratas;

public class Gerente extends Funcionario{

    private String area;

    public Gerente(String nome, String cargo, double salario, String area) {
        super(nome, cargo, salario);
        this.area = area;
    }

    @Override
    public double calcularAcrescimo() {
        return this.salario += this.salario * 0.2; //20%
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "  nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
