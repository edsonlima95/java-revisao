package Borientacaoobjetos.classes.Fassociacao.bidirecional;

public class Time {

    private String nome;

    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir(){
        System.out.println("Time: " + this.nome);
        if(this.jogadores.length > 0){
            for (Jogador jogador : jogadores) {
                System.out.println("Jogador: " + jogador.getNome() + " posição: " + jogador.getPossicao());
            }

        }
    }
}

