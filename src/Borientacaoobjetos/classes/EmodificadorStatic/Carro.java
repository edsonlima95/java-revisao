package Borientacaoobjetos.classes.EmodificadorStatic;

public class Carro {

    /**
     * Propriedades static pertencem a classe, ou seja os objetos de instâncias nao tem acesso
     * para acessar temos que chamar o nome da classe Carro.velocidadeMaxima uma vez alterado
     * seu valor todos os objetos será afetado.
     */

    private String marca;
    private static int velocidadeMaxima;

    public Carro(String marca) {
        Carro.velocidadeMaxima = 250;
        this.marca = marca;
    }

    public String getMarca() {
        ;
        return marca + " " + Carro.getVelocidadeMaxima();
    }

    public static int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static void setVelocidadeMaxima(int velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }


}
