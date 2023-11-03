package LThreads;

public class ClasseThread extends Thread {

    private String nome;
    private int tempo;

    public ClasseThread(String nome, int tempo) {
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
