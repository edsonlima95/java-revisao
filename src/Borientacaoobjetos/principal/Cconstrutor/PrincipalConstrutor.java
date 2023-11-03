package Borientacaoobjetos.principal.Cconstrutor;

import Borientacaoobjetos.classes.Cconstrutor.Empresa;

public class PrincipalConstrutor {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Google","San francisco CA", "google@gmail.com");
        Empresa empresa2 = new Empresa(); //Só e possivel pq existe um construtor padrão;



        System.out.println(empresa.toString());

    }

}
