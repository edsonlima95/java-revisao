package Borientacaoobjetos.classes.Jinterfaces;

public interface Automovel {

    public static int VELOCIDADE_MAXIMA = 300;

    /**
     * Por padrão, todos metodos em interfaces são abstratos.
     * public abstract void andar();
     * */
    public void acelerar();
    public void freiar();
    public void buzinar();

    /**
     * - Interfaces apartir do java 7 pode ter metodos concretos, basta apenas
     * colocar default na sua assinatura.
     *
     * - Metodos concretos não é obrigatório ser implementado por classes filhas
     * que implementa a interface.
     */

    default void airBarg(){
        System.out.println("O automovel tem airBArg!!!!");
    }

    /**
     * Interfaces também pode ter metodos static, lembrando que metodos estaticos nao
     * podem ser modificado/sobrescritos pois estao a nivel de classe e nao de instania
     */
    public static void tracao(){
        System.out.println("Metodo estatico dentro da interface");
    }

}
