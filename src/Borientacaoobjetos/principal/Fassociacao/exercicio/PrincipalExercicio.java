package Borientacaoobjetos.principal.Fassociacao.exercicio;

import Borientacaoobjetos.classes.Fassociacao.exercicio.Aluno;
import Borientacaoobjetos.classes.Fassociacao.exercicio.Local;
import Borientacaoobjetos.classes.Fassociacao.exercicio.Professor;
import Borientacaoobjetos.classes.Fassociacao.exercicio.Seminario;

public class PrincipalExercicio {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joãzinho");
        Aluno aluno2 = new Aluno("Chapelzinho");

        Professor professor1 = new Professor("Antão","Java");

        Local local = new Local("Centro de palestras");

        Seminario seminario = new Seminario("Curso de java");

        Seminario[] seminarios = {seminario};
        Aluno[] alunos = {aluno1, aluno2};

        aluno1.setSeminario(seminario);

        professor1.setSeminarios(seminarios);

        seminario.setLocal(local);
        seminario.setAlunos(alunos);

        System.out.println("---Aluno---");
        aluno1.imprime();

        System.out.println();

        System.out.println("---Professor---");
        professor1.imprimir();

        System.out.println();

        System.out.println("---Seminario---");
        seminario.imprimir();
    }

}
