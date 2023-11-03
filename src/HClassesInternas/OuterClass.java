package HClassesInternas;

public class OuterClass {

    private String nome;

    public OuterClass(String nome) {
        this.nome = nome;
    }

    class InnerClass {

        public String sobrenome = "Lima";
        public void mostrarNome(){
            System.out.println("meu nome: " + nome + " " +sobrenome);
        }

    }

}
