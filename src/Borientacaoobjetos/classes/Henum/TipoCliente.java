package Borientacaoobjetos.classes.Henum;

public enum TipoCliente {

    /**
     * Forma simples de declarar os enums - PESSOA_FISICA ou PESSOA_JURIDICA.
     *
     * Digamos que queiramos que pessoa fisica seja 1 e juridica 2 entao vamos criar um construtor
     * e criar uma variavel valor, depois temos que alterar os atributos.
     * PESSOA_FISICA(1)
     * PESSOA_JURIDICA(2)
     *
     * Podemos colocar mais de uma valor para o mesmo enum.
     */
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    /**
     * Atributes que irão representar os enums, a ordem importa.
     */

    public final int valor;
    public final String nome;


    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
