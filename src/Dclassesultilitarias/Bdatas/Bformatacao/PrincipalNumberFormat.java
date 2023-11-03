package Dclassesultilitarias.Bdatas.Bformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class PrincipalNumberFormat {

    public static void main(String[] args) {

        //Localidade.
        Locale dafault = Locale.getDefault();
        Locale brasil = new Locale("pt","BR");

        System.out.println("------------NUMEROS------------");

        double valor = 1_550.5649;

        NumberFormat numero = NumberFormat.getInstance(brasil);

        System.out.println(numero.getMaximumFractionDigits());

        System.out.println(numero.format(valor));


        System.out.println("------------MOEDAS------------");

        NumberFormat moedas = NumberFormat.getCurrencyInstance(brasil);

        System.out.println(moedas.format(valor));



    }

}
