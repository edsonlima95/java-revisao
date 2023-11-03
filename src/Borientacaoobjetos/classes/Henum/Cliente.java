package Borientacaoobjetos.classes.Henum;

public class Cliente {

    private String nome;

    private TipoCliente tipoCliente;

    private TipoCredito tipoCredito;

    public Cliente(String nome, TipoCliente tipoCliente, TipoCredito tipoCredito) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoCredito = tipoCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", tipoCredito=" + tipoCredito +
                '}';
    }

    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }
}
