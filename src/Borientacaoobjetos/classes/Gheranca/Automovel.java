package Borientacaoobjetos.classes.Gheranca;

/**
 * Classes com o final não podem ser herdadas.
 */
public class Automovel {

    private String modelo;
    private String marca;

    //Atributos com final não podem ser alterado seus valores.
    public static final int VELOCIDADE_MAXIMA = 300;


    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
    }

    /**
     * metodo com o final, não pode ser sobrescrito por classes filhas.
     */
    public final void imprimirMarca(){
        System.out.println("Marca: " + this.marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
