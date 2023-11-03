package Borientacaoobjetos.classes.Fassociacao.exercicio;

public class Seminario {

    private String titulo;

    private Aluno[] alunos;

    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Titulo: " + titulo + " local " + local.getEndereco());
        if(alunos.length > 0){
            for (Aluno aluno : alunos) {
                System.out.println("Aluno: " + aluno.getNome());
            }

        }
    }
}
