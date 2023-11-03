package Borientacaoobjetos.classes.Fassociacao.exercicio;

public class Professor {

    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome + " especialidade: " + especialidade);

        if(seminarios.length > 0){
            for (Seminario seminario : seminarios) {
                System.out.println("Seminario: " + seminario.getTitulo());
            }

        }
    }
}
