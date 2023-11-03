package Borientacaoobjetos.classes.Aparametros;


public class ParametrosReferenciaImprimir {

    public void mostrar(ParametrosReferencia tiposReferencia) {
        System.out.println("Nome: " + tiposReferencia.nome);
        System.out.println("Idade: " + tiposReferencia.idade);
        /**
         * Altera o nome da variavel na referencia, ou seja logo apos a excução "nome"
         * e removido seu valor e setado como banana para as proximas chamadas do metodo
         */
        tiposReferencia.nome = "banana";
    }

}
