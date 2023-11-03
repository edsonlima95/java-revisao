package Borientacaoobjetos.classes.Fassociacao.exercicio;

public class Aluno {

    private String nome;

    private Seminario seminario;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }


    public void imprime(){
        System.out.println("Nome: " + nome + " seminario: " + seminario.getTitulo());
    }
}
