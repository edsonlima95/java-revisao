package LThreads;

public class Principal01StartRunSleep {

    public static void main(String[] args) {

        Thread t1 = new ClasseThread("Thread #1", 900);
        Thread t2 = new ClasseThread("Thread #2", 300);

        t1.start();
        t2.start();
    }
}
