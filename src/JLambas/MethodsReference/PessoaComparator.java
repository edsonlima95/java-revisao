package JLambas.MethodsReference;

public class PessoaComparator {

    public static int comparaPorNome(Pessoa p1, Pessoa p2){
        return p1.getNome().compareTo(p2.getNome());
    }

    public int comparaPorIdade(Pessoa p1, Pessoa p2){
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }

}
