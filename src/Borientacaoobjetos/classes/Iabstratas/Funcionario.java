package Borientacaoobjetos.classes.Iabstratas;

/**
 * - Classes abastratas nao podem ser instânciadas apenas herdadas por outras classes.
 * - Podem ter metodos abstratos e também metodos concretos.
 * - Toda classe que herdar uma classe abstrata obrigatóriamente terá que implementar
 * seus metodos abstratos, mas não nescessariamente metodos concretos.
 */

public abstract class Funcionario {
    
    protected String nome;
    protected String cargo;
    protected double salario;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        calcularAcrescimo();
    }

    public abstract double calcularAcrescimo();

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }


}
