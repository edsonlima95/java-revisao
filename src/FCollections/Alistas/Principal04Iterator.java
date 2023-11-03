package FCollections.Alistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal04Iterator {

    public static void main(String[] args) {

        Produto p1 = new Produto("café", 50);
        Produto p2 = new Produto("feijão", 2);
        Produto p3 = new Produto("arroz", 5);
        Produto p4 = new Produto("java", 44);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        /**
         * Para remover ou adicionar ou qualquer outra alteração em Listas dentro de laços
         * de repetição a melhor maneira e correta é com Iterator.
         */

        //Primeira opção
        Iterator<Produto> produtosItarator = produtos.iterator();
        while (produtosItarator.hasNext()) { //Sempre percorre a lista.
            Produto produto = produtosItarator.next();

            if (produto.getQuantidade() > 5) {
                produtosItarator.remove();
                System.out.println(produto.getNome());
            }
        }

        System.out.println("---------------------");

        //Segunda opção simplificada usando funcional
        /*
            produtos.removeIf(produto -> produto.getQuantidade() < 10);
            System.out.println(produtos.toString());
        */
    }

}

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}


