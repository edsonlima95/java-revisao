package Borientacaoobjetos.classes.Kpolimorfismo;

public class Computador extends Produto{

    public static final double TAXA = 0.2; // 20%

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    /**
     * CONCEITO - POLIMORFISMO DE SOBREPOSIÇÃO.
     *
     * Quando sobrescrevemos metodos com mesma assinatura da superclasse, e mudamos seu comportamento em
     * classes filhas/subclasses.
     */

    @Override
    public double calcularTaxa() {
        return  this.valor * TAXA;
    }
}
