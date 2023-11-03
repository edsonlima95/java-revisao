package GGenerics.classes;

public class Gato implements Animal{

    private String raca;

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Chamando o metodo gato...");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
