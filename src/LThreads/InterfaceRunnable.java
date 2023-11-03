package LThreads;

public class InterfaceRunnable implements Runnable{

    private String nome;
    private int tempo;

    public InterfaceRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(nome + " " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " terminou");
    }
}
