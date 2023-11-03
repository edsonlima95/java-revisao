package Borientacaoobjetos.classes.Jinterfaces;

public class Carro implements Automovel{

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro: " + this.marca + " acelerou!!!");
    }

    @Override
    public void freiar() {
        System.out.println("O carro: " + this.marca + " freiou!!!");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro: " + this.marca + " buzinou!!!");
    }

    @Override
    public void airBarg() {
        System.out.println("Carro chamando airBargs!!!");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
