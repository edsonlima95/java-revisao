package HClassesInternas;

public class Principal02OuterClassEstatica {

    public static void main(String[] args) {

        /**
         * Classes internas só podem ser acessadas de fora, se quem for acessar
         * estiver no mesmo pacote.
         */

        OuterClassEstatica.InnerClassEstatica innerClass = new OuterClassEstatica.InnerClassEstatica();

        //Chamada do metodo de instância
        innerClass.mostrarIdade();

        System.out.println();

        //Chamada do metodo estático
        innerClass.mostrarNome2();

    }

}
