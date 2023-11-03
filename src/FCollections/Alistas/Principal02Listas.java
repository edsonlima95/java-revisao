package FCollections.Alistas;

import java.util.*;


public class Principal02Listas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(20L,"edson");
        Pessoa p2 = new Pessoa(10L,"maria");

        List<Pessoa> pessoas = new ArrayList();

        pessoas.add(p1);
        pessoas.add(p2);

        Pessoa p3 = new Pessoa(10L,"edson");
        System.out.println(pessoas.contains(p3));

        System.out.println(p1.equals(p2));

        System.out.println("-----ORDENANDO COM COMPARABLE------");

        //Passando a classe Pessoa com o comparable
        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("-----ORDENANDO COM COMPARATOR------");

        //Pessoa com o comparator.
        Collections.sort(pessoas, new PessoaSortCostum());
        //pessoas.sort(new PessoaSortCostum());

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}

/**
 * Comparator - podemos costumizar por qual atributo  sera ordenado
 */
class PessoaSortCostum implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getNome().compareTo(pessoa2.getNome());
    }
}

class Pessoa implements Comparable<Pessoa> {

    private Long id;
    private String nome;

    private double preco;

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        //Double.compare(this.preco, pessoa.preco);
        return this.id.compareTo(pessoa.getId());
    }
}

