package Aintroducao;

public class Aula02Operadores {
    public static void main(String[] args) {

        // Aritimeticos
        int num1 = 10;
        int num2 = 20;


        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num2 - num1));
        System.out.println("Divisão: " + (num2 / num1));
        System.out.println("Multiplicação: " + (num1 * num2));

        System.out.println();
        System.out.println("OPERADORES LÓGICOS");

        // Operadores lógicos
        boolean maior = 10 > 20;
        boolean menor = 10 < 20;
        boolean igual = 10 == 20;
        boolean diferente = 10 != 20;

        System.out.println();

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);

        System.out.println();
        System.out.println("OPERADORES COMPARAÇÃO");

        // Operadores de comparação
        int idade = 18;
        boolean habilitacao = true;

        if (idade >= 18 && habilitacao) {
            System.out.println("Pode dirigir...");
        } else {
            System.out.println("Vá tirar a habilitação...");
        }
        
        if (idade < 18 || !habilitacao) {
            System.out.println("Vá tirar a habilitação...");
        } else {
            System.out.println("Você pode dirigir...");
        }

        System.out.println();
        System.out.println();

        if (!habilitacao) {
            System.out.println("Precisa tirar a habilitação!");
        } else {
            System.out.println("Tudo ok com a habilitacao!");
        }
    }
}
