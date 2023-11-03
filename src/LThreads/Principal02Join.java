package LThreads;

public class Principal02Join {

    public static void main(String[] args) {

        Thread t1 = new Thread(new InterfaceRunnable("Thread #1", 500));
        Thread t2 = new Thread(new InterfaceRunnable("Thread #2", 600));
        Thread t3 = new Thread(new InterfaceRunnable("Thread #3", 800));

        t1.start();
        //t1.join(200); - espere 200 ms para executar a t2.
        t2.start();
        t3.start();

        /**
         * Join - espera a execução de uma thread acabar, nesse caso só quando as 3 threads
         * termina que a mensagem PROGRAMA FINALIZADO, será exibida não importa o tempo
         * que a thread demorar.
         */
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PROGRAMA FINALIZADO");

    }
}
