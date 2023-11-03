package Aintroducao.arrays;

public class Aula05ArraysMultidimencionais {

    public static void main(String[] args) {

        /**
         * maria joao  pedro
         * lima  silva araujo
         * 
         */

        String[][] nomes = { { "maria", "joão", "pedro" }, { "lima", "silva", "araujo" } };
        
        System.out.println("nome "+nomes[0][0] + " sobrenome " + nomes[1][1]);

        System.out.println("------------------------------------");

        for (int i = 0; i < nomes.length; i++) {
            
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + " ");
            }

            System.out.println();
        }
        
        System.out.println("------------------------------------");

        for (String[] linhas : nomes) {
            for (String colunas : linhas) {
                System.out.print(colunas + " ");
            }
            System.out.println();
        }

      
    }
}
