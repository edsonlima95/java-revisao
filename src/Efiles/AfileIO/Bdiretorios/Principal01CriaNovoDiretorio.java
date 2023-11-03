package Efiles.AfileIO.Bdiretorios;

import java.io.File;

public class Principal01CriaNovoDiretorio {

    public static void main(String[] args) {


        File diretorio = new File("pasta");

        //Cria uma nova pasta
        boolean pastacriada = diretorio.mkdir();

        System.out.println("Pasta criada: " + pastacriada);

        //Renomeia a pasta existente.
        File renomearPasta = new File("pastarenomeada");

        boolean pastarenomeada = diretorio.renameTo(renomearPasta);

        System.out.println("Past foi renomeada: " + pastarenomeada);

    }


}
