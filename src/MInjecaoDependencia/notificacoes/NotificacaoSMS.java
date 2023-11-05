package MInjecaoDependencia.notificacoes;

import MInjecaoDependencia.modelo.Cliente;

public class NotificacaoSMS implements Notificacao {

    @Override
    public void notificar(Cliente cliente){
        System.out.println("SMS de confirmação enviado para " + cliente.getNome());
    }

}
