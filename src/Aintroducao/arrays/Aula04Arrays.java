package Aintroducao.arrays;

public class Aula04Arrays {
    
    public static void main(String[] args) {
    
        //Inicia um espaço na memoria com 3 posições.
        int [] idades = new int[3];
        //int [] idades = new int[]{1,2,3};

        //Inicia o array e já atribui os valores.
        String [] nomes = {"maria","joão","pedro"};

        //Atribui os valores a cada posição do array na memoria.
        idades[0] = 21;
        idades[1] = 31;
        idades[2] = 41;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Indice: " + i + " numero: "+ idades[i]);
        }

        System.out.println();

        for (String nome : nomes) {
            System.out.println("Nome: "+ nome);
        }
    }
}
