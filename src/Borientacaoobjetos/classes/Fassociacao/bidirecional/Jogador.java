package Borientacaoobjetos.classes.Fassociacao.bidirecional;

public class Jogador {

    private String nome;
    private String possicao;

    private Time time;

    public Jogador(String nome, String possicao) {
        this.nome = nome;
        this.possicao = possicao;
    }

    public String getNome() {
        return nome;
    }

    public String getPossicao() {
        return possicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime(){
        System.out.print("Nome: " + this.nome + " posição: " + this.possicao);
        if(time != null){
            System.out.println(" Time: " + this.time.getNome());
        }
    }
}
