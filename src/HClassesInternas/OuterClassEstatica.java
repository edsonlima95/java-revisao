package HClassesInternas;

public class OuterClassEstatica {

    public static final String NOME = "edson";
    public int idade = 21;

    static class InnerClassEstatica {

        public int idade = 31;

        public void mostrarIdade() {
            System.out.println("minha idade: " + " " + idade);
        }

        public static void mostrarNome2() {
            System.out.println("meu nome: " + OuterClassEstatica.NOME);
        }

    }

}
