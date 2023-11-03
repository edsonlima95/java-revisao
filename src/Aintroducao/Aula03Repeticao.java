public class Aula03Repeticao {
    public static void main(String[] args) {

        // white, do while, for
        System.out.println("-------------WHILE--------------");
        int count = 0;
        while (count < 10) {
            System.out.println("Imprimindo " + count);
            count++;
        }

        System.out.println("-------------DO WHILE--------------");

        int count2 = 5;
        do {
            System.out.println("Imprime uma vez mesmo a condição sendo falsa!");
            count2++;
        } while (count2 < 10);

        System.out.println("-------------FOR--------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("For " + i);
        }

        System.out.println();
        System.out.println("-------------BREAK--------------");
        double valor = 30000;

        for (int parcela = 1; parcela <= valor; parcela++) {
            double valortotal = valor / parcela;

            /**
             * O break aqui serve para quando o valor da parcela for menor que 1000 pare a
             * execução do for
             * caso nao tivesse ia continuar do 0 ate 30000 vezes.
             */
            if (valortotal < 1000) {
                break;
            }

            System.out.println("parcela " + parcela + " valor " + Math.round(valortotal));

        }
        
        System.out.println();
        System.out.println("-------------CONTINUE--------------");

        for (int parcela = (int) valor; parcela > 1; parcela--) {
            double valortotal = valor / parcela;

            if (valortotal < 1000) {
                continue;
            }
        
            System.out.println("parcela " + parcela + " valor " + Math.round(valortotal));

        }

    }
}
