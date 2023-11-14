package Borientacaoobjetos.classes.Dblocoinicializacao;

public class BlocoInicializacao {

    private String nome;

    private int[] episodios = new int[20];

    /**
     * 0 - blocos de inicialização são executados até mesmo antes da alocação do objeto em memoria.
     * 1 - É criado um espaço de memoria para o objeto.
     * 2 - Todos os atributos de classe são criados e inicializados com valor padrão ou setado
     * 3 - O bloco de inicialização e executado.
     * 4 - O construtor e executado.
     */

    //Bloco de inicialização.
    {
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+ 1;
        }
        System.out.println("Bloco di inicialização iniciado");
    }

    public BlocoInicializacao(){
        //Mostra os valores.
        for(int episodio : this.episodios){
            System.out.print(episodio + " ");
        }


    }

    public BlocoInicializacao(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
