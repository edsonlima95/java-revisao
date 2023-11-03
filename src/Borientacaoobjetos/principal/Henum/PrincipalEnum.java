package Borientacaoobjetos.principal.Henum;

import Borientacaoobjetos.classes.Henum.Cliente;
import Borientacaoobjetos.classes.Henum.TipoCliente;
import Borientacaoobjetos.classes.Henum.TipoCredito;

public class PrincipalEnum {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Edson", TipoCliente.PESSOA_FISICA, TipoCredito.CREDITO);
        Cliente cliente2 = new Cliente("Edson", TipoCliente.PESSOA_JURIDICA, TipoCredito.DEBITO);

        System.out.println(cliente.toString());
        System.out.println(cliente2.toString());

        System.out.println();

        System.out.println(cliente.getTipoCredito().DEBITO.calculaTaxa(1000));
        System.out.println(cliente2.getTipoCredito().CREDITO.calculaTaxa(1000));

    }

}
