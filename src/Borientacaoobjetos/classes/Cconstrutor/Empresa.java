package Borientacaoobjetos.classes.Cconstrutor;

public class Empresa {

    private String nome;
    private String endereco;
    private String email;

    //Construtor com parametros de inicialização
    public Empresa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Empresa(String nome, String endereco, String email){
        /**
         * this(); chama o construtor, assim ao adicionar novas propriedades não iremos
         * quebrar o codigo bastando apenas criar um novo construtor com a nova propriedade
         * e chamar o construtor passando os parametros.
         */
        this(nome, endereco);
        this.email = email;
    }

    //Construtor padrão, mesmo que nao declarado toda classe tem um padrão.
    public Empresa(){}

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
