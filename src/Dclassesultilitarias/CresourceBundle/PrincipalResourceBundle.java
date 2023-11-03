package Dclassesultilitarias.CresourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PrincipalResourceBundle {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola"));

        System.out.println(bundle.getString("java.learn"));

    }

}
