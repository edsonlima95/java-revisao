package IOptional;

public class Carro {

    private Integer Id;
    private String nome;

    public Carro(Integer id, String nome) {
        Id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
