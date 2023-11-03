package Cexcecoes.blocotrycatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExemploMultiCatch {

    public static void main(String[] args) {

        /**
         * Primeira forma de capturar multiplos catch.
         */
        try {

            throw new ArrayIndexOutOfBoundsException();

        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * Podemos também capturar as exceções em LINHA, separadas apenas por | mas
         * apenas exceções que nao sao  mesma linha de herança.
         *
         * Ex: ArrayIndexOutOfBoundsException | IndexOutOfBoundsException
         *
         */

        try {

            throw new IllegalArgumentException();

        }catch(IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e){
            e.printStackTrace();
        }

        /**
         * Nesse try não podemos colocar uma exceção do tipo RunTimeException.
         * pois nao seguem a mesma linha de herança.
         */
        try {
            pegaExcecoes();
        }catch (IOException | SQLException e){
            e.printStackTrace();
        }
    }

    public static void pegaExcecoes() throws SQLException , IOException {
        System.out.println("Lança duas exceções");
    }

}
