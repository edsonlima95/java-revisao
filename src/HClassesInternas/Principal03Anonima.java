package HClassesInternas;

class Animal {

    public void mostrar(){
        System.out.println("Mostrar de dentro de animal");
    }

}

public class Principal03Anonima {

    public static void main(String[] args) {

        Animal animal = new Animal(){

            @Override
            public void mostrar() {
                System.out.println("Mostrar dentro do metodo main");
                imprimir();
            }

            public void imprimir(){
                System.out.println("Imprimir dentro da classe anonima");
            }
        };

        animal.mostrar();

        //animal.imprimir(); //Error: imprimir so ta visivel dentro da classe anonima.

    }

}
