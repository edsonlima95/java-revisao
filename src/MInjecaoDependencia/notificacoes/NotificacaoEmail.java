package MInjecaoDependencia.notificacoes;

import MInjecaoDependencia.modelo.Cliente;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void notificar(Cliente cliente){
        System.out.println("Email de confirmação enviado para " + cliente.getEmail());
    }

}
