package MInjecaoDependencia;

import MInjecaoDependencia.modelo.Cliente;
import MInjecaoDependencia.notificacoes.NotificacaoEmail;
import MInjecaoDependencia.notificacoes.NotificacaoSMS;
import MInjecaoDependencia.servico.ClienteService;

public class PrincipalCliente {

    //Simulando um controller.
    public static void main(String[] args) {

        //Injeta a dependência de notificação.
        //ClienteService clienteService = new ClienteService(new NotificacaoEmail());
        ClienteService clienteService = new ClienteService(new NotificacaoSMS());

        Cliente cliente1 = new Cliente("edson", "edson@gmail.com");

        clienteService.cadastrar(cliente1);


    }
}
