package Dclassesultilitarias.Astrings.Cdesempenho;

public class Desempenho {

    public static void main(String[] args) {

        System.out.println("----------------NORMAL-----------------");

        long inicio = System.currentTimeMillis();
        concatenaStrings(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de concatenação: " + (fim - inicio) + " ms");

        System.out.println("----------------STRING BUFFER-----------------");

        inicio = System.currentTimeMillis();
        concatenaStrings2(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de concatenação: " + (fim - inicio) + " ms");


        System.out.println("----------------STRING BUILDER-----------------");

        inicio = System.currentTimeMillis();
        concatenaStrings3(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de concatenação: " + (fim - inicio) + " ms");

    }

    public static void concatenaStrings(int tamanho) {

        String text = "";

        for (int i = 0; i < tamanho; i++) {
            text += i;
        }

    }

    public static void concatenaStrings2(int tamanho) {

        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    public static void concatenaStrings3(int tamanho) {

        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }
}
