package GGenerics;

import GGenerics.classes.Cachorro;
import GGenerics.classes.Gato;
import GGenerics.classes.GenericService;

import java.util.List;

public class Principal02Generics {

    public static void main(String[] args) {

        List<Gato> listaGatos = List.of(new Gato("Gato01"), new Gato("Gato02"));
        List<Cachorro> listaCachorro = List.of(new Cachorro("Cachorro01"), new Cachorro("Cachorro01"));

        GenericService<Gato> crudGatos = new GenericService();

        System.out.println(crudGatos.listar(listaGatos));

        crudGatos.cadastrar(new Gato("Gato03"));
    }
}
