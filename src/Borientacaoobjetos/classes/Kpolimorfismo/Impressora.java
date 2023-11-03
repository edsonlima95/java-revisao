package Borientacaoobjetos.classes.Kpolimorfismo;

public class Impressora extends Produto{

    public static final double TAXA = 0.1; // 10%

    private String tipo;

    public Impressora(String nome, double valor, String tipo) {
        super(nome, valor);
        this.tipo = tipo;
    }

    /**
     * Polimorfismo de sobreposição.
     * @return
     */
    @Override
    public double calcularTaxa() {
        return  this.valor * TAXA;
    }

    public String getTipo() {
        return tipo;
    }
}
