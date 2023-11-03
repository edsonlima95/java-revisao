package HClassesInternas;

public class Principal01OuterClass {

    public static void main(String[] args) {

        /**
         * Classes internas só podem ser acessadas de fora, se quem for acessar
         * estiver no mesmo pacote.
         */

        OuterClass outerClass = new OuterClass("edson");

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.mostrarNome();

    }

}
