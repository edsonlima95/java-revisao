package GGenerics.classes;

public class Cachorro implements Animal{

    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Chamando o metodo cachorro...");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
