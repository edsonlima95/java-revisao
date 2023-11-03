package GGenerics.classes;

import java.util.ArrayList;
import java.util.List;

public class GenericService<T> {

    private List<T> lista = new ArrayList<>();

    public List<T> listar(List<T> lista){
        return lista;
    }

    public void cadastrar(T object){
        System.out.println("Cadastrando" +  object.toString());
    }

}
