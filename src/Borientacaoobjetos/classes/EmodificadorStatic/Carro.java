package Borientacaoobjetos.classes.EmodificadorStatic;

public class Carro {

    /**
     * Propriedades static pertencem a classe, ou seja os objetos de instâncias nao tem acesso
     * para acessar-los, para isso temos que chamar o nome da classe ex: Carro.velocidadeMaxima
     * uma vez alterado seu valor todos os objetos será afetado.
     */

    private String marca;
    private static int velocidadeMaxima;

    public Carro(String marca) {
        Carro.velocidadeMaxima = 250;
        this.marca = marca;
    }

    public String getMarca() {
        return marca + " " + getVelocidadeMaxima();
    }

    /**
     * metodos marcados como estáticos, só aceitam propriedades também estáticas, porém
     * metodos de instância podem acessar propriedades estáticas.
     */

    public static int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static void setVelocidadeMaxima(int velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }


}
