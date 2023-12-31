package KStreams.classes;

public class Produto {

    private String nome;
    private double preco;

    private Categoria categoria;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, Categoria categoria) {
        this(nome, preco);
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
