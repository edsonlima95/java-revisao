package Borientacaoobjetos.classes.Kpolimorfismo;

import Borientacaoobjetos.classes.Kpolimorfismo.interfaces.Taxa;

public abstract class Produto implements Taxa {

    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
