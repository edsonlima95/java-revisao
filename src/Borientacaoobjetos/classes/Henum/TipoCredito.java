package Borientacaoobjetos.classes.Henum;

public enum TipoCredito {

    /**
     * Com enum podemos também sobrescrever metodos e mudar seu comportamento
     * de acordo com tipo.
     */

    CREDITO {
        @Override
        public double calculaTaxa(double valor) {
            return valor * 0.05;
        }
    },
    DEBITO {
        @Override
        public double calculaTaxa(double valor) {
            return valor * 0.1;
        }
    };

    /**
     * Como esse metodo serve apenas de modelo para os enums, podemos assinar como
     * abstrato assim que for usar será responsável pelo seu funcionamento.
     */
    public abstract double calculaTaxa(double valor);

}
